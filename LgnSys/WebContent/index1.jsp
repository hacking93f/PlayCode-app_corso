 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, java.io.* ,javax.servlet.*" %>

  <!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Progetto</title>
    
    <link rel = "stylesheet" href = "css/master.css">
    <link href="https://fonts.googleapis.com/css?family=Chakra+Petch"
    rel="stylesheet">
    
  </head>
  <body>

    <!--Header-->
    <header class= "header">
      <h1 data-scroll="toggle(.fromTopIn, .fromTopOut)"><img src = "images/LOGO.png" alt ="Welcome to Playcode"></h1>
    </header>

    <!--Navigation-->
    <nav class= "navbar">

<h1>

<%String name =session.getAttribute("username").toString();
%>
<font size="6" color="red"><%= name%>
</font>

</h1>


      <a href ="logout">Logout</a>
      <a href ="#Welcome">Welcome</a>
      <a href ="#Linguaggi">Linguaggi</a>
      <a href ="#About">About</a>
      <a href ="#Contact">Contact</a>
      



    </nav>

    <!--Welcome-->
    <section class ="content about" id="About">
      <article class="contain">
       <h2 class ="title" data-scroll="toggle(.fromBottomIn, .fromBottomOut)">About</h2>
       <p data-scroll="toggle(.fromBottomIn, .fromBottomOut)">blblblblblblablabalbalblabalblblabalablablba</p>
       <a href="#" class="btn" data-scroll="toggle(.fromRightIn, .fromRightOut)">Start</a>
      </article>

    </section>


    <!--Linguaggi-->
    <section class ="content linguaggi" id="Linguaggi">
      <h2 class="title" data-scroll="toggle(.fromRightIn, .fromRightOut)" >Linguaggi</h2>
      <p data-scroll="toggle(.fromBottomIn, .fromBottomOut)">bllblblblblblblblblblblablabalbalablabalbalb</p>
	  <!--lista-->
      <ul class="list-linguaggi" data-scroll="toggle(.fromBottomIn, .fromBottomOut)">
        <li>
          <figure>
            <a href="indexscala">
            <img src="images/locoscala.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Scala</figcaption>
          </figure>
          
        </li>
        <li>
          <figure>
            <a href="indexasm">
            <img src="images/logoasm.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Assembly</figcaption>
          </figure>
          
        </li>
        <li>
          <figure>
            <a href="indexc">
            <img src="images/logoc.png" alt="NOOOOOOOME">
          </a>
            <figcaption>C</figcaption>
          </figure>
           
        </li>
        <li>
          <figure>
            <a href="indexc++">
            <img src="images/logoc++.png" alt="NOOOOOOOME">
          </a>
            <figcaption>C++</figcaption>
          </figure>
          
        </li>
        <li>
          <figure>
            <a href="indexcsh">
            <img src="images/logocsh.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Cscharp</figcaption>
          </figure>
           
        </li>
        <li>
          <figure>
            <a href="indexcss3">
            <img src="images/logocss3.png" alt="NOOOOOOOME">
          </a>
            <figcaption>CSS3</figcaption>
          </figure>
         
        </li>
        <li>
          <figure>
            <a href="indexgroovy">
            <img src="images/logogroovy.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Groovy</figcaption>
          </figure>
          
        </li>
        <li>
          <figure>
            <a href="indexhtml">
            <img src="images/logohtml.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Html</figcaption>
          </figure>
          
        </li>
      </ul>

      <ul class="list-linguaggi" data-scroll="toggle(.fromBottomIn, .fromBottomOut)">
        <li>
          <figure>
            <a href="indexjava">
            <img src="images/logojava.png" alt="NOOOOOOOME">
          </a>
          
            <figcaption>Java</figcaption>
            
          </figure>
       
        </li>
        <li>
          <figure>
            <a href="indexjs">
            <img src="images/logojs.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Javascript</figcaption>
          </figure>
        
        </li>
        <li>
          <figure>
            <a href="indexvb">
            <img src="images/lovovb.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Visualbasic</figcaption>
          </figure>
         
        </li>
        <li>
          <figure>
            <a href="indexperl">
            <img src="images/logoperl.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Perl</figcaption>
          </figure>
         
        </li>
        <li>
          <figure>
            <a href="indexphp">
            <img src="images/logophp.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Php</figcaption>
          </figure>
         
        </li>
        <li>
          <figure>
            <a href="indexpy">
            <img src="images/logopy.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Python</figcaption>
          </figure>
        
        </li>
        <li>
          <figure>
            <a href="indexruby">
            <img src="images/logoruby.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Ruby</figcaption>
          </figure>
         
        </li>
        <li>
          <figure>
            <a href="indexswift">
            <img src="images/logoswift.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Swift</figcaption>
          </figure>
          
        </li>
      </ul>




     </section>
     <section class="content who" id="Welcome">
       <h2 class="title">Welcome</h2>
         <p>  blablabalablabalbalablabalablbalablabalbalablabalbalablabalbalablab
           blabalablablabalablablablabalbalbalbalbalbalbalablablablablablablaa
           balbalablablabalba</p>
         <p> blablabalbalablablablabalbalablabalbalablablabla
           blablabalablabalbalablabalablbalablabalbalablabalbalablabalbalablab
             blabalablablabalablablablabalbalbalbalbalbalbalablablablablablablaa
             balbalablablabalba</p>



     </section>



    <!--non contiene il php tomcat non lo riconosce ;) gestiscitelo sul server l'altro server apache di xampp-->



	

<section class="content contact" id="Contact">
     

      <a class="title" href="http://hacking93f.ddns.net">Contact Form</a>
	
		</section>



<script src="js/ScrollTrigger.min.js"></script>
<script type="text/javascript">
window.counter = function() {

	var span = this.querySelector('span');
	var current = parseInt(span.textContent);

	span.textContent = current + 1;
};

document.addEventListener('DOMContentLoaded', function(){
  var trigger = new ScrollTrigger({
	  addHeight: true
  });
});
</script>
   
   
   <script type="text/javascript">

       function cancella(){
           document.modulo.reset();
       }
       function uguali(u,o){
           if ((u.user==o.user)&&(u.pass==o.pass)) {


               return true; }
           return false;
       }
       function controlla(){
           var u=JSON.parse(localStorage.utenti);

           var lunghezza=u.length;
           var o={ user:document.modulo.uname.value , pass:document.modulo.psw.value};


           for(i=0;i<lunghezza;i++){
               if(uguali(u[i],o)){
                   var p=u[i].point;
                   var aux={user:u[i].user,point:p};
                   localStorage.lastUser=JSON.stringify(aux);
                  location.href="index.html";
                   return true;
               }
           }
           alert("Username e/o password errati!");
           return true;
       }

   </script>



  </body>
</html>
