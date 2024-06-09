$(document).ready(function(){
    $("#detail1").hover(function(){
        alert("Hello Yashwanth");
     }, function(){
            alert("Bye! You now leave p1!");

    });
    $("input").focus(function(){
        $(this).css("background","yellow");
   
    });
    $("input").blur(function(){
        $(this).css("background","red");
    });
    $("#button").click(function(){
        $("ul li:first").hide();
    });

});
