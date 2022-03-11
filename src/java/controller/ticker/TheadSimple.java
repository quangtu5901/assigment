package controller.ticker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ticker;


/**
 *
 * @author thand
 */
public class TheadSimple implements Runnable {
    private final long millis;
    private final HttpServletRequest request;
    private final HttpServletResponse response;
    private ArrayList<ticker> list;

    /**
     *
     * @param millis
     * @param request
     * @param response
     * @param list
     */
    public TheadSimple(long millis, HttpServletRequest request, HttpServletResponse response, ArrayList<ticker> list) {
        this.millis = millis;
        this.request = request;
        this.response = response;
        this.list = list;
    }

   
    
    @Override
    public void run() {
        while (true) {
            request.getSession().getAttribute("crate");
            
            java.util.Date date =new java.util.Date(); 
            System.out.println(date);
            try {
                Thread.sleep(millis);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    /**
     *
     * @param request
     * @param response
     */
//    public void runthead(HttpServletRequest request, HttpServletResponse response){
//        long h = 60*1000;
//		TheadSimple runable = new TheadSimple(h);
//		Thread t1 = new Thread(runable);
//		t1.start();
//                
//        
//    }
    
    /**
     *
     * @param args
     */
//    public static void main(String args[]) {
//                long h = 60*1000;
//		TheadSimple runable = new TheadSimple(h);
//		Thread t1 = new Thread(runable);
//		t1.start();
//	}

}
