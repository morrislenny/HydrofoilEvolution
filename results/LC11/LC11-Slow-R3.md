# LC11-Slow-R3  
Linear Combination Scoring (Lift: 1, Drag: 1). Slow Velocity, Run 3: 3,000,000 generations.  
### Run Constants  
| V-Infinity (V∞) | Density (ρ) | angle-of-attack (AOT) |
|-----------------|-------------|----------------------|
|30 m/s           | 0.7708kg/m^3| 2.1 degrees          |  
### Wing Characteristics  
| Span   | Root-Chord | Min-Lift |
|--------|------------|----------|
| 11.24m | 2.67       | 27585N   |  
### Highest Scoring Individual  
**Standard NACA:** (NACA 9.27, 7.72)    
**Generation:** 245098  

| Lift         | Drag        | Cl-2D         |CL-3D       |CD-Induced    |Score|
|--------------|------------ |---------------|------------|--------------|-----|
| 68835.05555N | 34417.7614N | 2.033652514   |8.419532807 |4.20979498    |34417.29415|   

![LC11-Slow-R3-245098](LC11-Slow-R3-img/LC11-Slow-Run3-Gen245098.png)  

### Progress Over Time  

![Lift-Drag-Score-v-generation](https://docs.google.com/spreadsheets/d/e/2PACX-1vTnfQlO8sMVKv5APWqf5tG9tjN-NFp9RvM9YKOJGsmFnDpcOknf-9w64yE2MpEUjpHPiuo9VRJqJf7Z/pubchart?oid=1993248900&format=image)

![cl-2D, CL-3D, CD-I vs Generation](https://docs.google.com/spreadsheets/d/e/2PACX-1vTnfQlO8sMVKv5APWqf5tG9tjN-NFp9RvM9YKOJGsmFnDpcOknf-9w64yE2MpEUjpHPiuo9VRJqJf7Z/pubchart?oid=1912001327&format=image)

![C-M, C-P vs Gen](https://docs.google.com/spreadsheets/d/e/2PACX-1vTnfQlO8sMVKv5APWqf5tG9tjN-NFp9RvM9YKOJGsmFnDpcOknf-9w64yE2MpEUjpHPiuo9VRJqJf7Z/pubchart?oid=1149330522&format=image)

**Number of Successful Generations:** 11  

![LC11-Slow-R3-gif](https://media.giphy.com/media/xUOxfgzzkMAudl8nny/giphy.gif)  

### Raw Data  
```CSV
Run 3: Slow Speed | V-infity: 30 m/s | p = 0.7708kg/m^3 | a = 2.1

:thickness , 29.850000000000005 , :generation , 245098 , :positon-camber , 7.72 , :CD-Induced , 4.20979497958395 , :Lift , 68835.05555368299 , :corrected-thickness , 0.29850000000000004 , :score , 34417.2941495434 , :cl-2D , 2.03365251385833 , :Drag , 34417.761404139594 , :corrected-position-camber , 0.772 , :corrected-max-camber , 0.09269999999999999 , :max-camber , 9.27 , :CL-3D , 8.419532807105332 ,
:thickness , 34.86000000000001 , :generation , 228661 , :positon-camber , 7.97 , :CD-Induced , 4.209453608863703 , :Lift , 68832.26459248505 , :corrected-thickness , 0.3486000000000001 , :score , 34417.29411190748 , :cl-2D , 2.033577909331842 , :Drag , 34414.97048057757 , :corrected-position-camber , 0.7969999999999999 , :corrected-max-camber , 0.0868 , :max-camber , 8.68 , :CL-3D , 8.419191431781664 ,
:thickness , 30.13000000000001 , :generation , 84588 , :positon-camber , 8.36 , :CD-Induced , 4.21045863664573 , :Lift , 68840.48112317627 , :corrected-thickness , 0.3013000000000001 , :score , 34417.293898891694 , :cl-2D , 2.033797543478689 , :Drag , 34423.18722428458 , :corrected-position-camber , 0.836 , :corrected-max-camber , 0.07719999999999999 , :max-camber , 7.72 , :CL-3D , 8.420196433508746 ,
:thickness , 34.70000000000001 , :generation , 48637 , :positon-camber , 8.47 , :CD-Induced , 4.21122928990956 , :Lift , 68846.7808779877 , :corrected-thickness , 0.3470000000000001 , :score , 34417.2930713022 , :cl-2D , 2.03396594074091 , :Drag , 34429.487806685494 , :corrected-position-camber , 0.8470000000000001 , :corrected-max-camber , 0.07429999999999999 , :max-camber , 7.43 , :CL-3D , 8.420966985546292 ,
:thickness , 31.47000000000001 , :generation , 33914 , :positon-camber , 7.78 , :CD-Induced , 4.206874481646015 , :Lift , 68811.17463823347 , :corrected-thickness , 0.3147000000000001 , :score , 34417.290169121974 , :cl-2D , 2.033014158731598 , :Drag , 34393.884469111494 , :corrected-position-camber , 0.778 , :corrected-max-camber , 0.0913 , :max-camber , 9.13 , :CL-3D , 8.416611822303713 ,
:thickness , 39.46000000000001 , :generation , 4036 , :positon-camber , 8.03 , :CD-Induced , 4.212918513700404 , :Lift , 68860.5875306398 , :corrected-thickness , 0.39460000000000006 , :score , 34417.28924109862 , :cl-2D , 2.0343350031213743 , :Drag , 34443.29828954118 , :corrected-position-camber , 0.8029999999999999 , :corrected-max-camber , 0.08539999999999999 , :max-camber , 8.54 , :CL-3D , 8.422655740847288 ,
:thickness , 32.77 , :generation , 1742 , :positon-camber , 7.96 , :CD-Induced , 4.241089903721272 , :Lift , 69090.43606439023 , :corrected-thickness , 0.32770000000000005 , :score , 34416.818677395764 , :cl-2D , 2.040479030145863 , :Drag , 34673.61738699447 , :corrected-position-camber , 0.796 , :corrected-max-camber , 0.0875 , :max-camber , 8.75 , :CL-3D , 8.450769574053504 ,
:thickness , 26.569999999999997 , :generation , 794 , :positon-camber , 7.92 , :CD-Induced , 4.268212735274413 , :Lift , 69311.00928776698 , :corrected-thickness , 0.2657 , :score , 34415.64543817092 , :cl-2D , 2.0463751210331633 , :Drag , 34895.36384959606 , :corrected-position-camber , 0.792 , :corrected-max-camber , 0.08869999999999999 , :max-camber , 8.87 , :CL-3D , 8.477748901311273 ,
:thickness , 27.109999999999996 , :generation , 744 , :positon-camber , 7.69 , :CD-Induced , 4.137739738772138 , :Lift , 68243.41940890056 , :corrected-thickness , 0.27109999999999995 , :score , 34414.7555969729 , :cl-2D , 2.0178376274072627 , :Drag , 33828.66381192766 , :corrected-position-camber , 0.769 , :corrected-max-camber , 0.0926 , :max-camber , 9.26 , :CL-3D , 8.347167064232062 ,
:thickness , 29.599999999999994 , :generation , 192 , :positon-camber , 8.2 , :CD-Induced , 4.372228734123402 , :Lift , 70150.47747330836 , :corrected-thickness , 0.29599999999999993 , :score , 34404.71643145959 , :cl-2D , 2.0688147473993017 , :Drag , 35745.761041848775 , :corrected-position-camber , 0.82 , :corrected-max-camber , 0.08289999999999999 , :max-camber , 8.29 , :CL-3D , 8.580428122993236 ,
:thickness , 39.23 , :generation , 14 , :positon-camber , 8.29 , :CD-Induced , 2.370002221145769 , :Lift , 51648.00738856325 , :corrected-thickness , 0.3923 , :score , 32271.72627029904 , :cl-2D , 1.5742295770457955 , :Drag , 19376.28111826421 , :corrected-position-camber , 0.829 , :corrected-max-camber , 0.058899999999999994 , :max-camber , 5.89 , :CL-3D , 6.31730575550266 , 
```
