$(function(){
			$(".img_scroll img").each(function(i,item){
				$(item).mouseover(function(){
					window.clearInterval(tim)
					
				})
				$(item).mouseout(function(){
					tim = window.setInterval('t1()',1500)
				})
			})
			$(".pat-left-title li").each(function(i,item){
				$(item).mouseover(function(){
					window.clearInterval(tim)
					 // $(item).css({width:'200px',height:'200px','background':'red'});
					$(item).css({'background':'#f7f6f6','border-bottom':'2px solid #cea861','color': '#ab8e66'})
					if(i==0){
					$(".img_scroll img").eq(0).css("margin-left",'-0px')
					$(".img_scroll img").eq(1).css("margin-left",'-0px')
					$(".img_scroll img").eq(2).css("margin-left",'-0px')
					$(".img_scroll img").eq(3).css("margin-left",'-0px')
					$(".img_scroll img").eq(4).css("margin-left",'-0px')
					// $(".img_scroll").html(img)
					}
					if(i==1){
					$(".img_scroll img").eq(0).css("margin-left",'-100%')
					$(".img_scroll img").eq(1).css("margin-left",'-0px')
					$(".img_scroll img").eq(2).css("margin-left",'-0px')
					$(".img_scroll img").eq(3).css("margin-left",'-0px')
					$(".img_scroll img").eq(4).css("margin-left",'-0px')
					
					// $(".img_scroll").html(img)
					}
					if(i==2){
					$(".img_scroll img").eq(0).css("margin-left",'-100%')
					$(".img_scroll img").eq(1).css("margin-left",'-100%')
					$(".img_scroll img").eq(2).css("margin-left",'-0px')
					$(".img_scroll img").eq(3).css("margin-left",'-0px')
					$(".img_scroll img").eq(4).css("margin-left",'-0px')
					// $(".img_scroll").html(img)
					}
					if(i==3){
					$(".img_scroll img").eq(0).css("margin-left",'-100%')
					$(".img_scroll img").eq(1).css("margin-left",'-100%')
					$(".img_scroll img").eq(2).css("margin-left",'-100%')
					$(".img_scroll img").eq(3).css("margin-left",'-0px')
					$(".img_scroll img").eq(4).css("margin-left",'-0px')
					}
					if(i==4){
					$(".img_scroll img").eq(0).css("margin-left",'-100%')
					$(".img_scroll img").eq(1).css("margin-left",'-100%')
					$(".img_scroll img").eq(2).css("margin-left",'-100%')
					$(".img_scroll img").eq(3).css("margin-left",'-100%')
					$(".img_scroll img").eq(4).css("margin-left",'-0px')
					}
					$(".pat-left-title li:not(:eq("+ i +"))").css({'background':'#e3e2e2','border-bottom':'none','color': 'black'})
					
				})
				$(item).mouseout(function(){
					tim = window.setInterval('t1()',1500)
				})
				// if(i > 0){
				// $(".img_scroll img").eq(i-1).css("margin-left",'-100%')
				// // $(".img_scroll").html(img)
				// }
			})
			$(".part-title li").eq(0).css({'color':'#1da6ba','border-bottom':'#1da6ba','font-weight':'700'})
			$(".part-title li").each(function(i,item){
				$(item).mouseover(function(){
					$(item).css({'color':'#1da6ba','border-bottom':'#1da6ba','font-weight':'700'})
						$(".part-title li:not(:eq("+ i +"))").css({'border-bottom':'none','color': 'black','font-weight':'500'})
						$('.right_tit1').html($(".right_tit" + (i+1)).html())
					// $('.right_tit').html("$('.right_tit').html()")
					
				})
			})
			tim = window.setInterval('t1()',1500)
		})
		i = 0
		function t1(){
			if(i==0){
			$(".img_scroll img").eq(0).css("margin-left",'-0px')
			$(".img_scroll img").eq(1).css("margin-left",'-0px')
			$(".img_scroll img").eq(2).css("margin-left",'-0px')
			$(".img_scroll img").eq(3).css("margin-left",'-0px')
			$(".img_scroll img").eq(4).css("margin-left",'-0px')
			// $(".img_scroll").html(img)
			$(".pat-left-title li").eq(i).css({'background':'#f7f6f6','border-bottom':'2px solid #cea861','color': '#ab8e66'})
			$(".pat-left-title li:not(:eq("+ i +"))").css({'background':'#e3e2e2','border-bottom':'none','color': 'black'})
			
			}
			if(i==1){
			$(".img_scroll img").eq(0).css("margin-left",'-100%')
			$(".img_scroll img").eq(1).css("margin-left",'-0px')
			$(".img_scroll img").eq(2).css("margin-left",'-0px')
			$(".img_scroll img").eq(3).css("margin-left",'-0px')
			$(".img_scroll img").eq(4).css("margin-left",'-0px')
			$(".pat-left-title li").eq(i).css({'background':'#f7f6f6','border-bottom':'2px solid #cea861','color': '#ab8e66'})
			$(".pat-left-title li:not(:eq("+ i +"))").css({'background':'#e3e2e2','border-bottom':'none','color': 'black'})
			
			// $(".img_scroll").html(img)
			}
			if(i==2){
			$(".img_scroll img").eq(0).css("margin-left",'-100%')
			$(".img_scroll img").eq(1).css("margin-left",'-100%')
			$(".img_scroll img").eq(2).css("margin-left",'-0px')
			$(".img_scroll img").eq(3).css("margin-left",'-0px')
			$(".img_scroll img").eq(4).css("margin-left",'-0px')
			$(".pat-left-title li").eq(i).css({'background':'#f7f6f6','border-bottom':'2px solid #cea861','color': '#ab8e66'})
			$(".pat-left-title li:not(:eq("+ i +"))").css({'background':'#e3e2e2','border-bottom':'none','color': 'black'})
			
			}
			if(i==3){
			$(".img_scroll img").eq(0).css("margin-left",'-100%')
			$(".img_scroll img").eq(1).css("margin-left",'-100%')
			$(".img_scroll img").eq(2).css("margin-left",'-100%')
			$(".img_scroll img").eq(3).css("margin-left",'-0px')
			$(".img_scroll img").eq(4).css("margin-left",'-0px')
			$(".pat-left-title li").eq(i).css({'background':'#f7f6f6','border-bottom':'2px solid #cea861','color': '#ab8e66'})
			$(".pat-left-title li:not(:eq("+ i +"))").css({'background':'#e3e2e2','border-bottom':'none','color': 'black'})
			
			}
			if(i==4){
			$(".img_scroll img").eq(0).css("margin-left",'-100%')
			$(".img_scroll img").eq(1).css("margin-left",'-100%')
			$(".img_scroll img").eq(2).css("margin-left",'-100%')
			$(".img_scroll img").eq(3).css("margin-left",'-100%')
			$(".img_scroll img").eq(4).css("margin-left",'-0px')
			$(".pat-left-title li").eq(i).css({'background':'#f7f6f6','border-bottom':'2px solid #cea861','color': '#ab8e66'})
			$(".pat-left-title li:not(:eq("+ i +"))").css({'background':'#e3e2e2','border-bottom':'none','color': 'black'})
			
			}
			i++
			if(i == 5){
				i = 0
			}
			console.log(i)
		}