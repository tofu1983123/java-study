$(function(){
	var heightlightindex = -1;
	//获取文本框
	var wordInput = $("#word");
	var autoNode = $("#auto");
	autoNode.hide();
	//添加键盘事件
	wordInput.keyup(function(event){
		var inputOffset = wordInput.offset();
		autoNode.css("border","1px solid black")
		.css("width",wordInput.width() + 5)
		.css("position","absolute")
		.css("top",inputOffset.top + wordInput.height() + 6)
		.css("left",inputOffset.left);
		var myevent = event || window.event;
		var keyCode = myevent.keyCode;
		if(keyCode >= 65 && keyCode <= 90 || keyCode == 8 || keyCode == 46){
			//获取文本框中的文本
			var word = wordInput.val();
			if(word != ""){
				//向后台发送请求获取响应的xml数据
				$.get("AutoCompleteServlet",{word:word},function(data){
					//alert(data);//---->数据xml格式转换成jquery格式
					var jqueryObj = $(data);
					//查找word节点
					var words = jqueryObj.find("word");
					autoNode.html("");
					words.each(function(i){
						var wordNode = $(this);
						//alert(wordNode.text());
						var newDiv = $("<div>");
						newDiv.attr("id",i);
						newDiv.html(wordNode.text());
						newDiv.mouseover(function(){
							//可以遍历全部低亮
							/*if(heightlightindex != -1){
								autoNode.children("div").eq(heightlightindex).css("background-color","white");
							}*/
							autoNode.children("div").css("background-color","white");
							$(this).css("background-color","silver");
							heightlightindex = $(this).attr("id");
						});
						newDiv.mouseout(function(){
							$(this).css("background-color","white");
							heightlightindex = -1;
						});
						newDiv.click(function(){
							var text = $(this).text();
							wordInput.val(text);
							autoNode.hide();
							heightlightindex = -1;
						});
						newDiv.appendTo(autoNode);
					});
					if(words.length > 0 ){
						autoNode.show();
					}else{
						autoNode.hide();
						heightlightindex = -1;
					}
				},"xml");
			}else{
				autoNode.hide();
				heightlightindex = -1;
			}
		}else if(keyCode == 38 || keyCode == 40){
			if(keyCode == 38){
				if(heightlightindex != -1){
					autoNode.children("div").eq(heightlightindex).css("background-color","white");
					heightlightindex--;
				}
				if(heightlightindex == -1){
					heightlightindex = autoNode.children("div").length - 1;
				}
				autoNode.children("div").eq(heightlightindex).css("background-color","silver");
			}
			if(keyCode == 40){
				if(heightlightindex != -1){//说明有高亮的存在,把高亮变为低亮
					autoNode.children("div").eq(heightlightindex).css("background-color","white");		
					heightlightindex++;
				}else{
					heightlightindex = 0;
				}
				if(heightlightindex == autoNode.children("div").length){
					heightlightindex = 0;
				}
				autoNode.children("div").eq(heightlightindex).css("background-color","silver");		
			}
		}else if(keyCode == 13){
			var text = autoNode.children("div").eq(heightlightindex).text();
			wordInput.val(text);
			autoNode.hide();
			heightlightindex = -1;
		}
		
	});
});