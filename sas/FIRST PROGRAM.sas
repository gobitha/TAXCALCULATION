data club1;
   input IdNumber Name $ Team $ StartWeight EndWeight; 
   datalines;
1 GOBITHAVANI IM 189 165 2 
2 NACHIYAR IMA 145 124 
3 MATHAN IM 210 192 
4 MAHESH IMA 194 177 
5 RAM red IM 118 
6 PRAVEEN IMA 220 . 2 
; 1  

proc print data=club1;
   title 'EFFICIEN TEAM MEMBERS';
run;