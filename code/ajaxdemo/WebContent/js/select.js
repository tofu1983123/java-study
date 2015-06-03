$(function(){
	var cartype = $("#cartype");
	var car = $("#car");
	cartype.change(function(){
		var cartypeName = $(this).val();
		$.get("SelectServlet",{cartype:cartypeName},function(data){
			car.html("");
			var obj = data;
			for(var i = 0;i < obj.length;i++){
				var option = $("<option value='"+obj[i]+"'>");
				option.html(obj[i]);
				car.append(option);
			}
		},"json");
	});
});