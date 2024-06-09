$(document).ready(function(){
    $(".two").click(function(){
      $("#two").animate({left: '250px'});
    });
    $(".but1").click(function(){
    $("#one").animate({
        left: '250px',
        opacity: '0.5',
        height: '150px',
        width: '150px'

    });
  });
});