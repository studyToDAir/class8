console.log(1651654161651651);

window.addEventListener("load", function(){
    let login = document.querySelector("#login");
    console.log('login', login);
    login.addEventListener('click', function(){
        console.log("로그인버튼 클릭");

        const id = document.querySelector("#id");
        console.log(id, id.value)

        const pw = document.querySelector("#pw");
        console.log(pw, pw.value)

        if( id.value == "admin" && pw.value == 1234){
            location.href = "http://naver.com";
        }

        if( id.value == '' ){
            console.log('id 안썼음')
            document.querySelector('#login_msg').style.color = '#f00';
            document.querySelector('#login_msg').textContent = '아이디는 필수입니다';
        } else if( pw.value == '' ){
            document.querySelector('#login_msg').style.color = '#f00';
            document.querySelector('#login_msg').textContent = '비밀번호는 필수입니다';
        } else {
            document.querySelector('#login_msg').textContent = '';
        }
    })

    document.querySelector("")


})

