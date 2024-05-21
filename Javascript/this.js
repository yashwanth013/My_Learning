$(document).ready(function(){
    $('p').click(function(){
        $('p').hide();
       
    }); 
    $('button').dblclick(function(){
    $("button").hide();
        $("#test").hide();
    })
    $('#name').mouseenter(function(){
        alert("Hello Yashwanth");
    }),$('#name').mouseleave(function(){
        alert("Bye yashwanth");
    });
});