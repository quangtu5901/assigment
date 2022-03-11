/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.binance.Tickerbinance;
import model.kuCoin.Tickerkucoin;

/**
 *
 * @author DEll
 */
public class JsonReader {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    private static String readJsonFromUrl(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
//            JSONObject json = new JSONObject(jsonText);
            return jsonText;
        } finally {
            is.close();
        }
    }

    /**
     *
     * @return
     */
    public static ArrayList<ticker> gettickerkucoinSpot() {
        String url = "https://api.kucoin.com/api/v1/market/allTickers";
        String json = null;
        ArrayList<ticker> liststickerKuCoin = new ArrayList<>();
        try {
            json = readJsonFromUrl(url);
        } catch (IOException ex) {
            Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (json != null) {
            String[] splits = json.split("\"ticker\":");
            String[] splits1 = splits[1].split("}}");
            Gson gson = new Gson();
            Type objtype = new TypeToken<ArrayList<Tickerkucoin>>() {
            }.getType();
            ArrayList<Tickerkucoin> lists = gson.fromJson(splits1[0], objtype);
            liststickerKuCoin.removeAll(liststickerKuCoin);
            for (Tickerkucoin t : lists) {
                double CRate = Double.parseDouble(t.getChangeRate()) * 100;
                CRate = (double) Math.ceil(CRate * 1000) / 1000;
                String ChangeRate = String.valueOf(CRate);
                double vol = Double.parseDouble(t.getVolValue()) / 1000000;
                vol = (double) Math.ceil(vol * 1000) / 1000;
                String volume = String.valueOf(vol);
                liststickerKuCoin.add(new ticker(t.getSymbolName(), t.getBuy(), ChangeRate, t.getChangePrice(), volume));
            }
            return liststickerKuCoin;
        }
        return null;
    }

    /**
     *
     * @return
     */
    public static ArrayList<ticker> gettickerkucoinFuteres() {
        String url = "https://api.kucoin.com/api/v1/market/allTickers";
        String json = null;
        ArrayList<ticker> liststickerKuCoin = new ArrayList<>();
        try {
            json = readJsonFromUrl(url);
        } catch (IOException ex) {
            Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (json != null) {
            String[] splits = json.split("\"ticker\":");
            String[] splits1 = splits[1].split("}}");
            Gson gson = new Gson();
            Type objtype = new TypeToken<ArrayList<Tickerkucoin>>() {}.getType();
            ArrayList<Tickerkucoin> lists = gson.fromJson(splits1[0], objtype);
            liststickerKuCoin.removeAll(liststickerKuCoin);
            for (Tickerkucoin t : lists) {
                double CRate = Double.parseDouble(t.getChangeRate()) * 100;
                CRate = (double) Math.ceil(CRate * 1000) / 1000;
                String ChangeRate = String.valueOf(CRate);
                double vol = Double.parseDouble(t.getVolValue()) / 1000000;
                vol = (double) Math.ceil(vol * 1000) / 1000;
                String volume = String.valueOf(vol);
                liststickerKuCoin.add(new ticker(t.getSymbolName(), t.getBuy(), ChangeRate, t.getChangePrice(), volume));
            }
            return liststickerKuCoin;
        }
        return null;
    }

    /**
     *
     * @return
     */
    public static ArrayList<ticker> getliststickerBinanceSpot() {
        String url = "https://api.binance.com/api/v3/ticker/24hr";
        String json = null;
        ArrayList<ticker> liststickerBinanceSpot = new ArrayList<>();
        try {
            json = readJsonFromUrl(url);
        } catch (IOException ex) {
            Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (json != null) {
            Gson gson = new Gson();
            Type objtype = new TypeToken<ArrayList<Tickerbinance>>() {
            }.getType();
            ArrayList<Tickerbinance> lists = gson.fromJson(json, objtype);
            for (Tickerbinance t : lists) {
                double CRate = Double.parseDouble(t.getPriceChangePercent());
                String ChangeRate = String.valueOf(CRate);
                double vol = Double.parseDouble(t.getQuoteVolume()) / 1000000;
                vol = (double) Math.ceil(vol * 1000.0) / 1000.0;
                String volume = String.valueOf(vol);
                liststickerBinanceSpot.add(new ticker(t.getSymbol(), t.getLastPrice(), ChangeRate, t.getPriceChange(), volume));
            }
            return liststickerBinanceSpot;
        }
        return null;
    }

    /**
     *
     * @return
     */
    public static ArrayList<ticker> getliststickerBinanceFutures() {
        String url = "https://fapi.binance.com/fapi/v1/ticker/24hr";
        String json = null;
        ArrayList<ticker> liststickerBinanceFutures = new ArrayList<>();
        try {
            json = readJsonFromUrl(url);
        } catch (IOException ex) {
            Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (json != null) {
            Gson gson = new Gson();
            Type objtype = new TypeToken<ArrayList<Tickerbinance>>() {
            }.getType();
            ArrayList<Tickerbinance> lists = gson.fromJson(json, objtype);
            for (Tickerbinance t : lists) {
                double CRate = Double.parseDouble(t.getPriceChangePercent());
                String ChangeRate = String.valueOf(CRate);
                double vol = Double.parseDouble(t.getQuoteVolume()) / 1000000;
                vol = (double) Math.ceil(vol * 1000.0) / 1000.0;
                String volume = String.valueOf(vol);
                liststickerBinanceFutures.add(new ticker(t.getSymbol(), t.getLastPrice(), ChangeRate, t.getPriceChange(), volume));
            }
            return liststickerBinanceFutures;
        }
        return null;
    }

    /**
     *
     * @return
     */
    public static String getlist(){
        String url = "https://api.binance.com/api/v3/ticker/24hr";
        String json = null;
        ArrayList<ticker> liststickerBinanceSpot = new ArrayList<>();
        try {
            json = readJsonFromUrl(url);
        } catch (IOException ex) {
            Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return json;
        
    }

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++) {
            System.out.println(gettickerkucoinFuteres().get(i).toString());
        }
    }
}
