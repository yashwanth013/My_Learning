$(document).ready(function(){
    $("button").click(function(){
        $("h2").toggle();
    });
    $(".but1").click(function(){
        $("#div1").fadeIn();
        $("#div2").fadeIn("slow");
        $("#div3").fadeIn(3000);
    });
    $(".but2").click(function(){
        $("#one").fadeOut();
        $("#two").fadeOut("slow");
        $("#three").fadeOut(3000);
    
   
    });

    
});