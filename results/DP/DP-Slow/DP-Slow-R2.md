# DP-Slow-R2   
Drag-Priority Scoring, Slow Velocity, Run 2: 3,000,000 generations.  
### Run Constants  
| V-Infinity (V∞) | Density (ρ) | angle-of-attack (AOT) |
|-----------------|-------------|----------------------|
|30 m/s           | 0.7708kg/m^3| 2.1 degrees          |  
### Wing Characteristics  
| Span   | Root-Chord | Min-Lift |
|--------|------------|----------|
| 11.24m | 2.67       | 27585N   |  
### Highest Scoring Individual  
**Standard NACA:** (NACA 6.84, 8.909596107)    
**Generation:** 828575  

| Lift         | Drag        | Cl-2D         |CL-3D       |CD-Induced    |Score|
|--------------|------------ |---------------|------------|--------------|-----|
| 76271.43214N | 42255.87386N| 2.232432545   |9.329110291 |5.168510628   |76271.43214|  

![DP-Slow-R2-828575](DP-Slow-R2-img/DP-Slow-Run2-Gen828575.png)  

### Progress Over Time  

![Lift-Drag-Score-v-generation](https://docs.google.com/spreadsheets/d/e/2PACX-1vSnEDDLmcHSUO8eve4-OOgJ9aVBDunhAeweDa1H8PTPXppWaZ56NWF4ky1mjT0wuVVrJn_HzUiVFQJy/pubchart?oid=664232769&format=image)

![cl-2D, CL-3D, CD-I vs Generation](https://docs.google.com/spreadsheets/d/e/2PACX-1vSnEDDLmcHSUO8eve4-OOgJ9aVBDunhAeweDa1H8PTPXppWaZ56NWF4ky1mjT0wuVVrJn_HzUiVFQJy/pubchart?oid=751552955&format=image)

![C-M, C-P vs Gen](https://docs.google.com/spreadsheets/d/e/2PACX-1vSnEDDLmcHSUO8eve4-OOgJ9aVBDunhAeweDa1H8PTPXppWaZ56NWF4ky1mjT0wuVVrJn_HzUiVFQJy/pubchart?oid=1728979104&format=image)

**Number of Successful Generations:** 9  

![DP-Slow-R2-gif](https://media.giphy.com/media/3o6fJ1S62HyNCAmtLq/giphy.gif)  

### Raw Data  
```CSV
Run 2: Slow Speed | V-infity: 30 m/s | p = 0.7708kg/m^3 | a = 2.1| max-drag = 7759.1N

:thickness , 9.770000000000001 , :generation , 828575 , :positon-camber , 8.909596106814297 , :CD-Induced , 5.168510628148594 , :Lift , 76271.43213796815 , :corrected-thickness , 0.09770000000000001 , :score , 76271.43213796815 , :cl-2D , 2.2324325450058398 , :Drag , 42255.87385539581 , :corrected-position-camber , 0.8909596106814297 , :corrected-max-camber , 0.0684 , :max-camber , 6.84 , :CL-3D , 9.329110290754631 ,
:thickness , 17.71 , :generation , 754610 , :positon-camber , 8.460261440367486 , :CD-Induced , 5.1684779421780505 , :Lift , 76271.19096503602 , :corrected-thickness , 0.1771 , :score , 76271.19096503602 , :cl-2D , 2.232426098268989 , :Drag , 42255.60662672057 , :corrected-position-camber , 0.8460261440367486 , :corrected-max-camber , 0.0828 , :max-camber , 8.28 , :CL-3D , 9.329080791782083 ,
:thickness , 9.53 , :generation , 349081 , :positon-camber , 8.469012096895389 , :CD-Induced , 5.1678985011810195 , :Lift , 76266.91544193489 , :corrected-thickness , 0.0953 , :score , 76266.91544193489 , :cl-2D , 2.232311810267894 , :Drag , 42250.86932666669 , :corrected-position-camber , 0.8469012096895389 , :corrected-max-camber , 0.0825 , :max-camber , 8.25 , :CL-3D , 9.328557832851812 ,
:thickness , 12.08 , :generation , 1059 , :positon-camber , 8.312860792617835 , :CD-Induced , 5.12383964074712 , :Lift , 75941.11318562081 , :corrected-thickness , 0.1208 , :score , 75941.11318562081 , :cl-2D , 2.223602866883436 , :Drag , 41890.660016354355 , :corrected-position-camber , 0.8312860792617836 , :corrected-max-camber , 0.0868 , :max-camber , 8.68 , :CL-3D , 9.288707457725344 ,
:thickness , 18.3 , :generation , 391 , :positon-camber , 8.750543136467684 , :CD-Induced , 4.991439737155005 , :Lift , 74953.53332369083 , :corrected-thickness , 0.183 , :score , 74953.53332369083 , :cl-2D , 2.1972041021772553 , :Drag , 40808.20628312889 , :corrected-position-camber , 0.8750543136467683 , :corrected-max-camber , 0.0724 , :max-camber , 7.24 , :CL-3D , 9.167912014469383 ,
:thickness , 24.42 , :generation , 89 , :positon-camber , 8.81 , :CD-Induced , 4.642701914552104 , :Lift , 72287.73124925036 , :corrected-thickness , 0.24420000000000003 , :score , 72287.73124925036 , :cl-2D , 2.125945174743403 , :Drag , 37957.05195633741 , :corrected-position-camber , 0.881 , :corrected-max-camber , 0.0681 , :max-camber , 6.81 , :CL-3D , 8.841845479875001 ,
:thickness , 32.18 , :generation , 5 , :positon-camber , 3.59 , :CD-Induced , 0.9205194598889753 , :Lift , 32188.125155747228 , :corrected-thickness , 0.3218 , :score , 32188.125155747228 , :cl-2D , 1.0540520480405338 , :Drag , 7525.834225175812 , :corrected-position-camber , 0.359 , :corrected-max-camber , 0.07490000000000001 , :max-camber , 7.49 , :CL-3D , 3.9370778968380735 ,
:thickness , 36.71 , :generation , 2 , :positon-camber , 5.81 , :CD-Induced , 0.06625738927045371 , :Lift , 8635.676283817415 , :corrected-thickness , 0.3671 , :score , 8635.676283817415 , :cl-2D , 0.4244770840377681 , :Drag , 541.6964546328209 , :corrected-position-camber , 0.581 , :corrected-max-camber , 0.013999999999999999 , :max-camber , 1.4 , :CL-3D , 1.056269355756363 ,
:thickness , 30.74 , :generation , 1 , :positon-camber , 3.06 , :CD-Induced , 0.011916142190761156 , :Lift , 3662.241947398509 , :corrected-thickness , 0.3074 , :score , 3662.241947398509 , :cl-2D , 0.29153338207509 , :Drag , 97.42206942817704 , :corrected-position-camber , 0.306 , :corrected-max-camber , 0.0058 , :max-camber , 0.58 , :CL-3D , 0.44794568662230544 , 
```
