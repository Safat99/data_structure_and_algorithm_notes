## Linear Search(VDO 5)
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


## Binary Search (VDO 6)

usecase onek beshi..
always ekta list dewa thakbe ar list ekta sequence e sajano thakbe...
steps:

* frst e sequence banano lagbe..
* list er ekdom mid index er value ber kora... jodi listsize even hoy tahole majher 2 tar jekono ekta...normally frst er ta newa hoy
* ebar amader desired nmbr ta mid index er daane ache na baame ache compare korte hobe.
* jekono ekside ei thakbe...taile opor side er otay aar khuja lagbe na...kaaj 50% kome gelo
* ebar abar mid er value khuje compare korbo

jodi amar list size 20 hoy tahole
```
20 >>> 10
10 >>> 5
5 >>> 3
3 >>> 2
2 >>> 1 
```
evabe total 5 ta step e amar 20 ta value search korar pera kome gelo....

etar time complexity log2(n)=5(4.something ... bt ceil value nite hobe)...suppose amar list-size 1024 .. jekhane amar linear search korle worst case e 1024 bar search kora lagbe...binary search korle eta 10 bar korlei amra peye  jabo...

### binary search er khetre amader alphabetically or numerically sort korai lagbe

```
a = [1,2,3,4,8,5,6]
a.sort()
n = int(input())
x = int('desired number')
left_index, right_index = 0, n-1
while(left_index <= right_index):
    mid = left_index + right_index //2
    if a[mid] == x:
        return mid, True
    if a[mid] < x:
        left_index = mid + 1
    else:
        right_index = mid - 1
return None
```
