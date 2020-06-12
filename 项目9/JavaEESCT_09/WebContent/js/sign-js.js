function t1(){
				var info = ''
				if($("#pwd").val() != $("#pwd2").val()){
					info += "两次密码不一致,"
				} 
				if($("#username").val() == '' || $("#email").val()== "" || $("#pwd").val() == '' || $("#pwd2").val() == ''){
					info += "您有信息未填"
				}
				if(info != null && info != '' ){
					alert(info)
				}else{
					$('.fr').submit()
				}
				
			}