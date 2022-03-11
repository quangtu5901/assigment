/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var hour = document.getElementById("elastedtime").value;
function change(){
    hour = document.getElementById("elastedtime").value
    alert(hour);
}        

var getvalue = function getvalue(){

        var number = document.getElementById("number").value;
        number++;
        document.getElementById("number").value = number;
        if(number == hour){
            document.getElementById("searchFrm").submit();
            number=0;
        }
}

var clear;
function Stat(){
    
    clear= setInterval(getvalue,hour*2000);
   
}
function Stop(){
    clearInterval(clear);
    document.getElementById("number").value=0;
}
