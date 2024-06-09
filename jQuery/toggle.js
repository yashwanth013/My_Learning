$(document).ready(function(){
    $(".but1").click(function(){
      $("#div1").fadeToggle();
      $("#div2").fadeToggle("slow");
      $("#div3").fadeToggle(3000);
    });
    $(".but2").click(function(){
        $("#one").fadeTo("slow", 0.15);
        $("#two").fadeTo("slow", 0.4);
        $("#three").fadeTo("slow", 0.7);
      });
  });