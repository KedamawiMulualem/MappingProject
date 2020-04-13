# MappingProject

<h1>Hands-Free Signaling</h1>

![](https://github.com/KedamawiMulualem/MappingProject/blob/master/Screen%20Shot%202020-04-12%20at%208.53.33%20PM.png)
![](https://github.com/KedamawiMulualem/MappingProject/blob/master/Screen%20Shot%202020-04-12%20at%208.53.45%20PM.png)

<h2>Abstract</h2>
<p>
  Cycling has been around for hundreds of years and will still be around for many more. With modern infrastructure accommodating motor vehicles and bicycles on the same shared road and pedestrians on pavements. It is important that motor vehicles and pedestrians are aware of a cyclist’s presence as collisions can be cataphoric and can lead to serious injuries or even death. Most fatal bicycle collisions occur at an intersection or at a turn. Traditionally, when a cyclist is going to make a turn at an intersection, they will use their arms and hands to signal to other vehicles and pedestrians of their intention. However, when they remove their hands off the handle bar to make the signal, they lose 50% of their braking capabilities and stability.
</p>
<p>
  This paper is a continuation of the previous semester (spring 2019) CS 498 Sr. Project I. It provides updates of goals and objectives for the Fall 2019 semester, physical design, software design and development timeline. The Fall development cycle will focus on software development and producing a simple prototype that functions with the software. 
</p>



<h2>1.0	Introduction</h2>
<p>
	Overall, bike accidents have declined over the past decade due to advocacy efforts. However, that does not mean that they don’t still happen. As more riders take to the road, the likelihood of a bicycle related collision also increases. According to statistics provided by Pedbikeinfo, in 2017, 783 bicyclists were involved in fatal crashes with motor vehicles in the United States. In 2003, pedestrians and bicyclists represented 12.6 percent of total traffic fatalities, and in 2017 they accounted for 18.2 percent of fatalities. “The majority of bicyclevehicle collisions occur in urban areas, according to the National Highway Traffic Safety Administration” ("Bike Accidents: Collisions with Cars at Intersections" 2018). Of all collisions that involve a motor vehicle and bicycle, nearly half occur at intersections. 
 </p>
 <p>
Traditionally, when a cyclist approaches a junction, they will use hand signals seen in figure 1, to indicate to the surrounding vehicles and pedestrians around them of their intended direction. Simultaneously, they will have to use their other hand which is still on the handlebar to brake and slow down and prepare for the maneuver. In addition, they will also have to turn their heads to check if the path is clear to complete the maneuver. In the event where the path is suddenly blocked (i.e. – another vehicle cuts off the cyclist or pedestrian jaywalking), the cyclist who has taken one hand off the handlebar has already lost 50% of their braking capability and stability and often will not be able to efficiently react to the situation. </p>

<h2>1.1	Concept </h2>
 <p>
	The idea is to develop a solution to the traditional signaling method using the cyclists existing equipment and minimal additions, where the cyclist still has 100% braking capabilities and simultaneously informing drivers and pedestrians of their turning intentions. 
	The solution should be, so the cyclist won’t have to take their hands off the handlebar and only have to turn their heads to make the turns. This is achieved by using a smart phone GPS features, a mobile application that uses the GoogleMaps API (or other Mapping sources), and a Bluetooth connected LED strip that blinks to indicate the signals. 
 </p>
   
<h2>1.2	Existing Products</h2>
 <p>
Cyclists wear reflective and often bright LED lights to create more presence and awareness on the road. In addition to their safety apparel cyclist will use hand gestures to inform other vehicles of their intentions. Unfortunately, these hand gestures are often discarded by other drivers or even ignored.  
Another issue with using hand signals, is that sometimes this form of communication to other drivers of the road is confusing and easily misinterpreted, some drivers mistaken a hand gesture to ‘stop’, for a signal to ‘turn left’, an example of this hand signals can be seen in figure 2.
 </p>




<h2>video of the application running</h2>

https://drive.google.com/file/d/1j0elSi6xI9AaQ-i2GIYqU5caYlJq94we/view?usp=sharing

<h2>First Ui of the application </h2>

![Application first Ui](https://github.com/KedamawiMulualem/MappingProject/blob/master/Screen%20Shot%202020-04-12%20at%208.00.17%20PM.jpg)


<h2>When user clicks on the application the start navigation botton is activated </h2>

![Application first Ui](https://github.com/KedamawiMulualem/MappingProject/blob/master/Screen%20Shot%202020-04-12%20at%208.00.35%20PM.png)


<h2>When ever a user clickes on the screen a rought to the clicked destination is generated with each turn being detected </h2>

![Application first Ui](https://github.com/KedamawiMulualem/MappingProject/blob/master/Screen%20Shot%202020-04-12%20at%208.00.55%20PM.png)

<h2>When When the user clickes on the start navigation Navigation louncher is lounched and navigation will start wile listening to navigation</h2>

![Application first Ui](https://github.com/KedamawiMulualem/MappingProject/blob/master/Screen%20Shot%202020-04-12%20at%208.01.47%20PM.png)



