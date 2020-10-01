<!DOCTYPE html>
<html>




<head>
    <meta charset="UTF-8"/>
    
    <title>Registrazione</title>
        <p align="center" ><font face="Trebuchet" size="32" color="black">Registrati qui! </font></p>
        <style type="text/css">
            form {
                border: 3px solid #f1f1f1;
                width: 33%;
                position:absolute ;
                left:35%;
                top:20%;
            }
            .accedi {
                    width: auto;
                    padding: 5px 10px;
                    background-color:#4CAF50;
                    position:relative;
                    color:white;
                    border:none;

                    }


            input[type=text], input[type=password] {
                width: 40%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
                position: relative;


            }


            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                font-family: "Comic Sans MS";
                border-radius:10px 10px 10px 10px;

            }


            button:hover {
                opacity: 0.8;
            }


            .cancelbtn {
                width: auto;
                padding: 5px 10px;
                background-color: #f44336;
                position:relative;
                left:65%;
                border-radius:10px 10px 10px 10px;

            }


            .imgcontainer {
                text-align: center;
                margin: 24px 0 12px 0;
            }


            img.avatar {
                width: 40%;
                border-radius: 50%;
            }


            .container {
                padding: 16px;
            }





            </style>

</head>

        <form action="register">



                    
                      <div>
                      <label><b>Username :</b></label>
                     <input type="text" id="username" placeholder="Inserisci Username" name="uname" required style="position:relative; left:4%;">
                     </div>
                      <div>
                      <label><b>   Password :</b></label>
                      <input type="password" id="password" placeholder="Inserisci Password" name="psw" required style="position:relative; left:5%;">

                     <button type="submit" value="register">Registrati</button>

                    </div>

                    <div class="container" style="background-color:#f1f1f1">
                       
                      <button type="button" class="cancelbtn" name="cnl" onclick="cancella()">Cancel</button>
    


                    
                    </div>


                    


 <a href="index.jsp">->Torna alla HOME<-</a>





</body>
</html>
