# LC11-Slow-R1  
Linear Combination Scoring (Lift: 1, Drag: 1). Slow Velocity, Run 1: 3,000,000 generations.  
### Run Constants  
| V-Infinity (V∞) | Density (ρ) | angle-of-attack (AOT) |
|-----------------|-------------|----------------------|
|30 m/s           | 0.7708kg/m^3| 2.1 degrees          |  
### Wing Characteristics  
| Span   | Root-Chord | Min-Lift |
|--------|------------|----------|
| 11.24m | 2.67       | 27585N   |  
### Highest Scoring Individual  
**Standard NACA:** (NACA 8.44, 8.07)    
**Generation:** 2562106  

| Lift         | Drag        | Cl-2D         |CL-3D       |CD-Induced    |Score|
|--------------|------------ |---------------|------------|--------------|-----|
| 68834.9326N  | 34417.63845N| 2.033649227   |9.329041483 |4.20977994    |34417.29415|  

![LC11-Slow-R1-2562106](LC11-Slow-R1-img/LC11-Slow-Run1-Gen2562106.png)  

### Progress Over Time  

![Lift-Drag-Score-v-generation](https://docs.google.com/spreadsheets/d/e/2PACX-1vTnfQlO8sMVKv5APWqf5tG9tjN-NFp9RvM9YKOJGsmFnDpcOknf-9w64yE2MpEUjpHPiuo9VRJqJf7Z/pubchart?oid=625063300&format=image)

![cl-2D, CL-3D, CD-I vs Generation](https://docs.google.com/spreadsheets/d/e/2PACX-1vTnfQlO8sMVKv5APWqf5tG9tjN-NFp9RvM9YKOJGsmFnDpcOknf-9w64yE2MpEUjpHPiuo9VRJqJf7Z/pubchart?oid=878117547&format=image)

![C-M, C-P vs Gen](https://docs.google.com/spreadsheets/d/e/2PACX-1vTnfQlO8sMVKv5APWqf5tG9tjN-NFp9RvM9YKOJGsmFnDpcOknf-9w64yE2MpEUjpHPiuo9VRJqJf7Z/pubchart?oid=1576530774&format=image) 

**Number of Successful Generations:** 12  

![LC11-Slow-R1-gif](https://media.giphy.com/media/3oxHQF1bwRGaQdITYI/giphy.gif)

### Raw Data
```CSV
Run 1: Slow Speed | V-infity: 30 m/s | p = 0.7708kg/m^3 | a = 2.1

:thickness , 21.83 , :generation , 2562106 , :positon-camber , 8.07 , :CD-Induced , 4.20977994027289 , :Lift , 68834.9325984391 , :corrected-thickness , 0.2183 , :score , 34417.29415026821 , :cl-2D , 2.0336492271706623 , :Drag , 34417.638448170896 , :corrected-position-camber , 0.807 , :corrected-max-camber , 0.08439999999999999 , :max-camber , 8.44 , :CL-3D , 8.419517767882926 ,
:thickness , 28.09 , :generation , 1150443 , :positon-camber , 7.72 , :CD-Induced , 4.20979497958395 , :Lift , 68835.05555368299 , :corrected-thickness , 0.2809 , :score , 34417.2941495434 , :cl-2D , 2.03365251385833 , :Drag , 34417.761404139594 , :corrected-position-camber , 0.772 , :corrected-max-camber , 0.09269999999999999 , :max-camber , 9.27 , :CL-3D , 8.419532807105332 ,
:thickness , 23.950000000000003 , :generation , 899975 , :positon-camber , 7.64 , :CD-Induced , 4.209800875639236 , :Lift , 68835.10375735481 , :corrected-thickness , 0.23950000000000002 , :score , 34417.29414919933 , :cl-2D , 2.0336538023793285 , :Drag , 34417.809608155476 , :corrected-position-camber , 0.764 , :corrected-max-camber , 0.09449999999999999 , :max-camber , 9.45 , :CL-3D , 8.419538703118532 ,
:thickness , 21.960000000000004 , :generation , 11357 , :positon-camber , 7.94 , :CD-Induced , 4.209199960441684 , :Lift , 68830.19075346258 , :corrected-thickness , 0.21960000000000005 , :score , 34417.29401065892 , :cl-2D , 2.033522474029338 , :Drag , 34412.896742803656 , :corrected-position-camber , 0.794 , :corrected-max-camber , 0.0876 , :max-camber , 8.76 , :CL-3D , 8.418937770975466 ,
:thickness , 18.910000000000004 , :generation , 1145 , :positon-camber , 8.710413368665519 , :CD-Induced , 4.168593252048128 , :Lift , 68497.3791647447 , :corrected-thickness , 0.18910000000000005 , :score , 34416.46818554112 , :cl-2D , 2.0246261658311497 , :Drag , 34080.91097920359 , :corrected-position-camber , 0.8710413368665518 , :corrected-max-camber , 0.0673 , :max-camber , 6.73 , :CL-3D , 8.378230052106703 ,
:thickness , 24.85 , :generation , 796 , :positon-camber , 8.98 , :CD-Induced , 4.258970359488108 , :Lift , 69235.92568753642 , :corrected-thickness , 0.24850000000000003 , :score , 34416.12416013493 , :cl-2D , 2.0443680789981973 , :Drag , 34819.80152740149 , :corrected-position-camber , 0.898 , :corrected-max-camber , 0.0599 , :max-camber , 5.99 , :CL-3D , 8.468565080214134 ,
:thickness , 29.88 , :generation , 205 , :positon-camber , 8.12 , :CD-Induced , 4.363294982961106 , :Lift , 70078.77178131675 , :corrected-thickness , 0.2988 , :score , 34406.04985834171 , :cl-2D , 2.0668979994339463 , :Drag , 35672.72192297505 , :corrected-position-camber , 0.8119999999999999 , :corrected-max-camber , 0.0848 , :max-camber , 8.48 , :CL-3D , 8.57165746941675 ,
:thickness , 23.39 , :generation , 88 , :positon-camber , 8.1 , :CD-Induced , 3.883931172690314 , :Lift , 66117.27666275186 , :corrected-thickness , 0.2339 , :score , 34363.65990468199 , :cl-2D , 1.9610042063838282 , :Drag , 31753.61675806987 , :corrected-position-camber , 0.8099999999999999 , :corrected-max-camber , 0.0805 , :max-camber , 8.05 , :CL-3D , 8.087108748599162 ,
:thickness , 24.19 , :generation , 70 , :positon-camber , 8.02 , :CD-Induced , 5.036429884077366 , :Lift , 75290.5709296521 , :corrected-thickness , 0.2419 , :score , 34114.54147465368 , :cl-2D , 2.2062133750471156 , :Drag , 41176.02945499842 , :corrected-position-camber , 0.8019999999999999 , :corrected-max-camber , 0.09380000000000001 , :max-camber , 9.38 , :CL-3D , 9.209136636978855 ,
:thickness , 19.67 , :generation , 39 , :positon-camber , 8.42401173611593 , :CD-Induced , 3.139367753315767 , :Lift , 59442.941325890206 , :corrected-thickness , 0.1967 , :score , 33776.605835093855 , :cl-2D , 1.7825941203542999 , :Drag , 25666.335490796348 , :corrected-position-camber , 0.842401173611593 , :corrected-max-camber , 0.065 , :max-camber , 6.5 , :CL-3D , 7.270740041080592 ,
:thickness , 28.05 , :generation , 13 , :positon-camber , 7.6 , :CD-Induced , 2.6705033184973064 , :Lift , 54824.63579619907 , :corrected-thickness , 0.2805 , :score , 32991.56637340097 , :cl-2D , 1.6591432828885464 , :Drag , 21833.0694227981 , :corrected-position-camber , 0.76 , :corrected-max-camber , 0.0755 , :max-camber , 7.55 , :CL-3D , 6.705853812578231 ,
:thickness , 35.97 , :generation , 1 , :positon-camber , 6.12 , :CD-Induced , 1.1369608957647048 , :Lift , 35772.719593393515 , :corrected-thickness , 0.35969999999999996 , :score , 26477.33845819776 , :cl-2D , 1.1498709977521846 , :Drag , 9295.381135195754 , :corrected-position-camber , 0.612 , :corrected-max-camber , 0.0636 , :max-camber , 6.36 , :CL-3D , 4.375526158776251 , 
```
