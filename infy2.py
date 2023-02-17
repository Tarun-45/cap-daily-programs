//same sum of digit pairs sub
l=list(map(int,input().split(",")))
k=[]
co=0
for i in range(len(l)):
    temp=l[i]
    sum=0
    while(temp!=0):
        sum+=temp%10
        temp=temp//10
    k.append(sum)
for i in range(len(k)):
    for j in range(i+1,len(k)):
        if(k[i]==k[j]):
            co+=1
if(co==0):
    print(-1)
print(co)


//longest substring
s=input()
m=0
l=[]
k=[]
ma=0
if(len(s)<3):
    print(-1)
for i in range(len(s)):
    k.append(s[i])
    m=0
    for j in range(i+1,len(s)):
        if(s[j] not in k):
            k.append(s[j])
            m+=1
        else:
            break
    ma=max(ma,m)
print(ma+1)


//word manipulation
s=input()
t=sorted((set(s.upper())))
l=[]
for i in range(len(t)):
    new=""
    for j in s:
        if(t[i]==j.upper()):
            new+=j
    l.append(new)
i=0
j=len(l)-1
p=""
while(i<=j):
    if(i==j):
        p+=l[i]
    else:
        p+=l[i]
        p+=l[j]
    i+=1
    j-=1
print(p)


//next small number
s=input()
i=1
while(i<=100):
    k=int(s)+1
    k=str(k)
    if(k==k[::-1]):
        print(k)
        break
    i+=1



//alternate even odd series
s=input()
t=""
l=len(s)
k=0
for i in range(len(s)):
    if(s[i]>="0" and s[i]<="9"):
        t+=s[i]
    if(s[i].isdigit() or s[i].isalpha()):
        k+=1
even=""
odd=""
new=""
for i in range(len(t)):
    if(int(t[i])%2==0):
        even+=t[i]
    else:
        odd+=t[i]
y=l-k
if(y%2==0):
    if(len(odd)>=len(even)):
        for i in range(len(even)):
            new+=(even[i])
            new+=(odd[i])
        new=new+odd[len(even):]
        print(new)
    else:
        for i in range(len(odd)):
            new+=(even[i])
            new+=(odd[i])
        new=new+even[len(odd):]
        print(new)

elif(y%2!=0):
    if(len(odd)>=len(even)):
        for i in range(len(even)):
            new+=(odd[i])
            new+=(even[i])
        new=new+odd[len(even):]
        print(new)
    else:
        for i in range(len(odd)):
            new+=(odd[i])
            new+=(even[i])
        new=new+even[len(odd):]
        print(new)
    



