$(document).ready(function(){
    $("#but1").click(function(){
    alert("Text:" + $('p').text());
});
$("#but2").click(function(){
    alert("Html:" + $('p').html());
});
});