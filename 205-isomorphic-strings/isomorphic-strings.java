// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if(s.length()!=t.length())return false;
//         Map<Character,Character>sTot=new HashMap<>();
//         Map<Character,Character>tTos=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             char _s=s.charAt(i);
//             char _t=t.charAt(i);
//             //abc
//             //abc
//             if(!sTot.containsKey(_s)&&!tTos.containsKey(_t)){
//                 sTot.put(_s,_t);
//                 tTos.put(_t,_s);
//             }
//             else if(sTot.get(_s)==null)return false;
//             else if(tTos.get(_t)==null)return false;
//             else if(sTot.get(_s)==_t && tTos.get(_t)==_s)return true;
//         }
//     return true;
//     }
// }
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (sToT.containsKey(a) && sToT.get(a) != b) {
                return false;
            }

            if (tToS.containsKey(b) && tToS.get(b) != a) {
                return false;
            }

            sToT.put(a, b);
            tToS.put(b, a);
        }

        return true;
    }
}