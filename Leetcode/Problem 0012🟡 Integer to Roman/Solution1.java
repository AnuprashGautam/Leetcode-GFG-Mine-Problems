class Solution1 {
    public String intToRoman(int num) {
        String romanNumber = ""; // The final answer i.e. roman number of integer.
        String integerNumber = String.valueOf(num); // Converted input integer number into string form.

        int len = integerNumber.length();

        for (int i = 0; i < len; i++) {
            if (len - (i + 1) == 3)                                     // Thousands place digit
            {
                switch (integerNumber.charAt(i)) {
                    case '1':
                        romanNumber += "M";
                        break;
                    case '2':
                        romanNumber += "MM";
                        break;
                    case '3':
                        romanNumber += "MMM";
                        break;
                    default:
                        break;
                }
            } else if (len - (i + 1) == 2)                             // Hundredth place digit
            {
                switch (integerNumber.charAt(i)) {
                    case '1':
                        romanNumber += "C";
                        break;
                    case '2':
                        romanNumber += "CC";
                        break;
                    case '3':
                        romanNumber += "CCC";
                        break;
                    case '4':
                        romanNumber += "CD";
                        break;
                    case '5':
                        romanNumber += "D";
                        break;
                    case '6':
                        romanNumber += "DC";
                        break;
                    case '7':
                        romanNumber += "DCC";
                        break;
                    case '8':
                        romanNumber += "DCCC";
                        break;
                    case '9':
                        romanNumber += "CM";
                        break;
                    default:
                        break;
                }
            } else if (len - (i + 1) == 1)                             // Tenth place digit
            {
                switch (integerNumber.charAt(i)) {
                    case '1':
                        romanNumber += "X";
                        break;
                    case '2':
                        romanNumber += "XX";
                        break;
                    case '3':
                        romanNumber += "XXX";
                        break;
                    case '4':
                        romanNumber += "XL";
                        break;
                    case '5':
                        romanNumber += "L";
                        break;
                    case '6':
                        romanNumber += "LX";
                        break;
                    case '7':
                        romanNumber += "LXX";
                        break;
                    case '8':
                        romanNumber += "LXXX";
                        break;
                    case '9':
                        romanNumber += "XC";
                        break;
                    default:
                        break;
                }
            } else {                                             // Ones place digit
                {
                    switch (integerNumber.charAt(i)) {
                        case '1':
                            romanNumber += "I";
                            break;
                        case '2':
                            romanNumber += "II";
                            break;
                        case '3':
                            romanNumber += "III";
                            break;
                        case '4':
                            romanNumber += "IV";
                            break;
                        case '5':
                            romanNumber += "V";
                            break;
                        case '6':
                            romanNumber += "VI";
                            break;
                        case '7':
                            romanNumber += "VII";
                            break;
                        case '8':
                            romanNumber += "VIII";
                            break;
                        case '9':
                            romanNumber += "IX";
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return romanNumber;
    }
}
