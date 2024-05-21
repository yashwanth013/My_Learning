$(document).ready(function(){
    $("button").click(function(){
      var txt = "";
      txt += "My name is Yashwanth" + "</br>";
      txt += "I have completed Btech from Computer science" ;
      $("#div1").html(txt);
    });
  });