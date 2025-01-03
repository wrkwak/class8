window.addEventListener("load", function(){
    //조건문
    // 선택한 것에 따라 다르게 #view에 출력
    // document.querySelector("#btn1").addEventListener("click", function(){
    //     const select = document.querySelector("[type=radio]:checked");
    //     const view = document.querySelector("#view");
    //     const value = select.value;
    //     if(value ==1){
        //         view.innerHTML += "밥먹어야지";
        //     } else if (value ==2){
            //         view.innerHTML += "휴식";
            //     } else if (value ==3){
                //         view.innerHTML += "공부";
                //     } 
                // });
            //시간
            function time(){
                let now = new Date(); // date type 가져와서
                let iso =now.toISOString() // 스트링으로 바꾸고
                let isoarr = iso.split("T") // split사용
                //-> t기준으로 스트링을 분리해서 배열에 넣음

                let isoarrr = isoarr[1].split(".")[0]
                
                const hh = isoarrr.split(":")[0]
                let mm = isoarrr.split(":")[1]
                let ss = isoarrr.split(":")[2]
                
                document.querySelector("#view").textContent = (parseInt(hh)+9)+":"+mm+":"+ss
            }
            
            setInterval(() => {
                time();
            }, 3)
            function tmr(){
                for(let i=3; i>=1; i--){
                    console.log(i)
                }
            }
            function countdown(start) {
                let current = start;
                const interval = setInterval(() => {
                    document.querySelector("#winview").textContent = current+'초 후에 이동합니다.'
                    console.log(current);
                    current--;
                    if (current < 1) {
                        clearInterval(interval);
                        document.querySelector("#winview").textContent = ''
                        console.log("발사!");
                        }
                    }, 1000);
                }
        
                
                
                document.querySelector("#login")
                .addEventListener("click", function(){
                    const id = document.querySelector("#id").value;
                    const pw = document.querySelector("#pw").value;
                    if (id == "" && pw ==""){
                        document.querySelector("#view").innerHTML = "아이디와 비밀번호를 입력해주세요";
                        document.querySelector('#view').style.color = 'red' // html 요소에 컬러가 있어도 덮어씌워짐
                    } else if(pw == ""){
                        document.querySelector("#view").innerHTML = "비밀번호를 입력해주세요.";
                        document.querySelector('#view').style.color = 'red'
                    } else if (id == "" ) {
                        document.querySelector("#view").innerHTML = "아이디를 입력해주세요.";
                        document.querySelector('#view').style.color = 'red'
                    } else {
                        document.querySelector("#view").innerHTML = "로그인 성공!";
                        document.querySelector('#view').style.color = 'blue'
                        countdown(3);
                    setTimeout(() => {
                        location.href="https://naver.com"
                    }, 3*1000);
                }
                
            });
        });