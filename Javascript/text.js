$(document).ready(function () {
  $("button").click(function () {
    $.ajax({
      url: "https://reqres.in/api/users?page=2",
      success: function (result) {
        var res = result;
        for(i=0;i<result.data.length;i++){
            
            console.log(result.data[i].email);
        }
        /*console.log(result.data[0].email);
        console.log(result.data[1].email);
        console.log(result.data[2].email);
        console.log(result.data[3].email);
        console.log(result.data[4].email);
        console.log(result.data[5].email);*/
      },
    });
  });
});
