<%-- 
    Document   : history
    Created on : Mar 5, 2022, 10:56:51 PM
    Author     : thand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <body>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
        <canvas id="myChart" width="500" height="200" style="border:1px solid #d3d3d3;">
            Your browser does not support the HTML canvas tag.</canvas>

        <script>
            var ctx = document.getElementById('myChart').getContext('2d');
            var chart = new Chart(ctx, {
                // The type of chart we want to create
                type: 'line',

                // The data for our dataset
                data: {
                    labels: ["January", "February", "March", "April", "May", "June", "July"],
                    datasets: [{
                            label: "My First dataset",
//                            backgroundColor: 'rgb(255, 99, 132)',
//                            borderColor: 'rgb(255, 99, 132)',
                            fillColor: "rgba(151,249,190,0.5)",
                            strokeColor: "rgba(255,255,255,1)",
                            pointColor: "rgba(220,220,220,1)",
                            pointStrokeColor: "#fff",
                            data: [2, 10, 5, 25, 20, 20, 20]
                        }, {
                            fillColor: "rgba(252,147,65,0.5)",
                            strokeColor: "rgba(255,255,255,1)",
                            pointColor: "rgba(173,173,173,1)",
                            pointStrokeColor: "#fff",
                            data: [28, 68, 40, 19, 90]
                        }]
                },

                // Configuration options go here
                options: {}
            });
        </script>

    </body>
</html>
