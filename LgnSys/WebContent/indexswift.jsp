<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Swift</title>
    <link rel = "stylesheet" href = "css/master2.css">
    <link href="https://fonts.googleapis.com/css?family=Chakra+Petch"
    rel="stylesheet">
  </head>
  <body>
<% String name = session.getAttribute("username").toString(); %>
  </body>
  <section class="content navbar">
  <nav class= "navbar">
  <font type="arial" size="6" color="red"><%=name %> </font>
    <a href ="index1.jsp">Home</a>
    <a href ="index1.jsp#Linguaggi">Linguaggi</a>
    <a href ="index1.jsp#About">About</a>
    <a href ="index1.jsp#Contact">Contact</a>
  </nav>
</section>
<section class ="content sfondo">
 <!-- Project One -->
 <h2 class="title">Linguaggio</h2>
 <ul class="list-ling">
   <li>
       <img src="images2/swiftgrande.jpg" alt="NOOOOOOOME">
       <figcaption>Nome</figcaption>
   </li>
  </ul>
</section>
<section class="content paragrafo">
  <p> bleblebelbelbelebleblebelbeleblebelbb</p>

</section>
<section>
 <ul class="list-linguaggi" data-scroll="toggle(.fromBottomIn, .fromBottomOut)">
        <li>
          <figure>
            <a href="java.jsp">
            <img src="icone/icons8-primo-organetto-evidenziato-in-primo-piano-filled-50.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Quiz n1</figcaption>
          </figure>
        </li>
         <li>
          <figure>
            <a href="java_2.html">
            <img src="icone/icons8-armadietto-della-scuola-50.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Quiz n2</figcaption>
          </figure>
        </li>
 </ul>
 </section>

 <ul class="list-linguaggi" data-scroll="toggle(.fromBottomIn, .fromBottomOut)">
        <li>
          <figure>
            <a href="cicici">
            <img src="icone/icons8-tecnologia-blockchain-50.png" alt="NOOOOOOOME">
          </a>
            <figcaption>Quiz n3</figcaption>
          </figure>
        </li>
    
 </ul>
 

 



<style>
#myProgress {
  width: 100%;
  background-color: #ddd;
}

#myBar {
  width: 1%;
  height: 30px;
  background-color: #4CAF50;
}
</style>
</body>


<div id="myProgress">
  <div id="myBar">questa?</div>
</div>

<br>
<button onclick="move()">Click Me</button> 


<script type="text/javascript"> 
  
function move() { 
  var element = document.getElementById("myBar");    
  var width = 1; 
  var identity = setInterval(scene, 10); 
  function scene() { 
    if (width >= 100) { 
      clearInterval(identity); 
    } else { 
      width++; 
       e
      element.style.width =  width+ '%';  
    } 
  } 
} 
  
</script> 

<script src="js/ScrollTrigger.min.js"></script>
<script>
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

<style type="text/css">


  .list-linguaggi { display: flex; justify-content: center; align-items:
	center;}
	.list-linguaggi figure { display: flex; justify-content: center; align-items: center; flex-flow: column;}

.list-linguaggi figure { position: relative; width: 150px; height: 190px;}
  .list-linguaggi figure:after {content: ""; position: absolute; top: 0; left: 0; border-radius: 50%; z-index: 0; background: #fff; width: 150px; height: 150px;}
    .list-linguaggi img {position: relative; z-index: 1;}
  .list-linguaggi li { padding: 0 10px; }
  .list-linguaggi figcaption { position: relative; left: 0; right: 0; bottom: -40px;}

  
  


    
  .fromTopIn
{
	transition: transfordata-scroll="toggle(.fromTopIn, .fromTopOut)"m 1.0s ease, opacity 1.0s ease;
	
	transform: translate(0,0);
	opacity: 1.0;
}

.fromTopOut
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: translate(0,-10px);
	opacity: 0.0;
}

.fromBottomIn
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: translate(0,0);
	opacity: 1.0;
}

.fromBottomOut
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: translate(0,10px);
	opacity: 0.0;
}

.fromLeftIn
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: translate(0,0);
	opacity: 1.0;
}

.fromLeftOut
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: translate(-10px,0);
	opacity: 0.0;
}

.fromRightIn
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: translate(0,0);
	opacity: 1.0;
}

.fromRightOut
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: translate(10px, 0);
	opacity: 0.0;
}

.scaleUpIn
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: scale(1.0,1.0);
	opacity: 1.0;
}

.scaleUpOut
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: scale(1.3,1.3);
	opacity: 0.0;
}

.scaleDownIn
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: scale(1.0,1.0);
	opacity: 1.0;
}

.scaleDownOut
{
	transition: transform 1.0s ease, opacity 1.0s ease;
	
	transform: scale(0.7,0.7);
	opacity: 0.0;
}
 

</style>
   

</html>
