$(function(){
			$(".book_title li").each(function(i,item){
				$(item).mouseover(function(){
					$(item).css("background-color","#1E90FF")
					$(".book_title li:not(:eq("+ i +"))").css("background-color","#EEEEEE")
					if(i==0){
					$(".book").eq(0).css("margin-left",'-0px')
					$(".book").eq(1).css("margin-left",'-0px')
					$(".book").eq(2).css("margin-left",'-0px')
					$(".book").eq(3).css("margin-left",'-0px')
					$(".book").eq(4).css("margin-left",'-0px')
					// $(".img_scroll").html(img)
					}
					if(i==1){
					$(".book").eq(0).css("margin-left",'-1400px')
					$(".book").eq(1).css("margin-left",'-0px')
					$(".book").eq(2).css("margin-left",'-0px')
					$(".book").eq(3).css("margin-left",'-0px')
					$(".book").eq(4).css("margin-left",'-0px')
					
					// $(".img_scroll").html(img)
					}
					if(i==2){
					$(".book").eq(0).css("margin-left",'-1400px')
					$(".book").eq(1).css("margin-left",'-1400px')
					$(".book").eq(2).css("margin-left",'-0px')
					$(".book").eq(3).css("margin-left",'-0px')
					$(".book").eq(4).css("margin-left",'-0px')
					// $(".img_scroll").html(img)
					}
					if(i==3){
					$(".book").eq(0).css("margin-left",'-1400px')
					$(".book").eq(1).css("margin-left",'-1400px')
					$(".book").eq(2).css("margin-left",'-1400px')
					$(".book").eq(3).css("margin-left",'-0px')
					$(".book").eq(4).css("margin-left",'-0px')
					}
					if(i==4){
					$(".book").eq(0).css("margin-left",'-1400px')
					$(".book").eq(1).css("margin-left",'-1400px')
					$(".book").eq(2).css("margin-left",'-1400px')
					$(".book").eq(3).css("margin-left",'-1400px')
					$(".book").eq(4).css("margin-left",'-0px')
					}
				})
			})
		})