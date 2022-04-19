 Library te boi khujar example… khujar jonne amader ek dhar theke shob gula ekta ekta kore search kore kore khujtesei… etai linear search..
Array shikhlei linear search algorithm shikha hoye jawa hoy

Frst example> >>
Ekta array er moddhe specific value khujar jonne suppose [10,20,30,40,50] …ekhane ki 20 ache ki na…etar jonne amra>>
```
a = [10,20,30,40,50]
for i in range(len(a)):
	if i==20:
		return i
else: 
	return -1
```

Evabe kora hoy… 

Etar time complexity >>> comparision operation challacchi…worst case hishabe chinta korte hobe… loop ta worst case e n er maan er upore depend kore…kajei ei algorithm er time complexity O(n) 

aar space complexity hobe >>> space complexity r jonne amader ekta array to diyei dise(a)… ekhane amrder c er jonne ar python er jonne space complexity change hobe…space complexity mainly depend kore koyta variable use hocche setar upore…ekhane amader n er maan jai hok na keno amader variable ektai(i) lagtese…kajei eta amar constant memory lagtese.. Ejonne space complexity hobe O(1) ba Order of 1. 
