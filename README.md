# Sel_Java

https://github.com/iJacob10/Sel_Java/tree/master/src/test/java/test

    |     https://flukeout.github.io/  |     CSS  |     Comments  |     
  |     #01 plate  |     tagname  |       |     
  |     #02 bento  |     tagname  |       |     
  |     #03 #fancy  |     #id  |       |     
  |     #04 plate > apple  |     tagname > tagname  |       |     
  |     #05 #fancy pickle  |     #id tagname  |       |     
  |     #06 .small  |     .classname  |       |     
  |     #07 orange.small  |     tagname.classname  |       |     
  |     #08 bento > orange.small  |     tagname > tagname.classname  |       |     
  |     #09 plate, bento  |     tagname, tagname  |       |     
  |     #10 *  |     *           ALL/Universal selector  |       |     
  |     #11 orange.small, pickle, plate > apple  |     tagname *  |       |     
  |     #12 plate + apple  |     tagname + tagname  |       |     
  |     #13 bento ~ pickle  |     tagname1 ~ tagname2*  |     follows another  |     
  |     #14 plate > apple  |     tagnameParent > tagnameChild  |     direct child  |     
  |     #15 orange:first-child  |     tagname:first-child  |     first-child  |     
  |     #16 plate *:only-child  |     tagname*:only-child  |     only-child  |     
"  |     #17 #fancy *:last-child , plate + pickle
    .small:last-child  |     tagname*:last-child  |     last-child  |     "
  |     #18 plate:nth-child(3)  |     tagname:nth-child(position)  |       |     
  |     #19 bento:nth-last-child(3)  |     tagname:nth-last-child(position)  |       |     
  |     #20 apple:first-of-type  |     tagname:first-of-type  |       |     
  |     #21 plate:nth-of-type(2n)  |     tagname:nth-of-type(even)    //odd  |       |     
  |     #22 plate:nth-of-type(2n+3)  |     tagname:nth-of-type(position)  |       |     
  |     #23 apple:only-of-type  |     tagname:only-of-type  |       |     
  |     #24 orange:last-of-type , apple:last-of-type  |     tagname:last-of-type  |       |     
  |     #25 bento:empty  |     tagname:empty  |       |     
  |     #26 apple:not(.small)  |     tagname:NOT(.classname)  |     select all that does not match  |     
"  |     #27 *[for]  |     *[attributeName]           
//  [attributeName]  |       |     "
  |     #28 plate[for]  |     tagname[attributeName]  |       |     
  |     #29 [for="Vitaly"]  |     tagname[attributeName="value"]  |       |     
  |     #30 [for^="Sa"]  |     [attribute^="va"]  |     attribute starts with  |     
  |     #31 [for$="ato"]  |     [attribute$="va"]  |     attribute ends with  |     
  |     #32 [for*="obb"]  |     [attribute*="va"]  |     attribute between with  |     
![image](https://user-images.githubusercontent.com/25654269/135891549-3b11927c-7cbb-4dfe-be0b-405b3886a75b.png)
