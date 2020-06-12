 window.onload = function(){
            var Words = document.getElementById("words");
            var Who = document.getElementById("who");
            var TalkWords = document.getElementById("talkwords");
            var TalkSub = document.getElementById("talksub");
            

            TalkSub.onclick = function(){
                //定义空字符串
                var str = "";
                if(TalkWords.value == ""){
                     // 消息为空时弹窗
                    alert("消息不能为空");
                    return;
                }
                    str = '<div class="btalk"><span>我说 :' + TalkWords.value +'</span></div>' ;  
                
                Words.innerHTML = Words.innerHTML + str;
            }
            
        }
