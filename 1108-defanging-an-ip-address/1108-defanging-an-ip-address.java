class Solution {

    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '.') {
                sb.insert(i, '[');
                sb.insert(i + 2, ']');
                i += 2;
            }
        }
        return sb.toString();
    }
}
