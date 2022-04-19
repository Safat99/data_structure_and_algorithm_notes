## Time Complexity —->>>>>>
### Big O(1) >>> 
jokhon program er operation er shongkha input er upore nirvor kore na …constant thake…eta maane ekta operation na…

```
a=10,b=20,c=a+b.
``` 
ekhane 3 ta assignment operation ar 1 ta sum operation hoise… bt era a er value 100 200 onek kichui hoite parto… input nmbr jotoi boroi hok na keno…total 4 ta operation e kora lagbe.,.. Taai etar naam O(1)...Order of 1 bola hoy

Arekta example >>>  
```
input =a 
result = n * ( n+1) / 2 
print(result) 
```
 ekhane multiply,addition, division 3 ta kaaj hoise then ekta assignment hoise…total 4 ta kaaj hoise..input ar result negligible karon era kebol ekbari kaj kore ba show kora laage… ekhaneo Order of 1 bolbo amra….

Aager program ta jodi amra loop chalay dharar kaaj ta kori…same result dibe… bt ekhane amader kheyal kora lagbe …
```
for i in range(1,n): 
    result = result +1
```   
Ekhane kintu amader program er operation ta n er upore depend kortese… n er value 10 hoile 10 bar operation … 100 hoile 100 bar operation … etar kintu order of 1 hobe na

Ekhane n er maan 1 hoile 2 ta operation…ekta jog arekta assignment operation…2 hole 4 ta operation 10 hole 20 ta operation … O(2n) bola jay.. 
Ekhon 
O(2n) = 2*O(n) >> jehetu 2 constant taai baire chole ashche
Kajei etare O(n) bola jay… etare linear complexity  o bola jaay

```
for i in range(n):
	for j in range(n):
		count = count + 1
```

Ekhane amar proti step e 2 bar operation kora lagse….kajei etare ami O(n^2) bolbo..jehetu n ejonne etar n^2 … jodi n er jaygay kono ekta definite value like 3 thakto..tahole tokhoh etare ar O(n^2) boltam na.. Tokhon O(n) hoto..
