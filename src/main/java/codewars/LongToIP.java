package codewars;

public class LongToIP {

    //Take the following IPv4 address: 128.32.10.1
    //
    //This address has 4 octets where each octet is a single byte (or 8 bits).
    //
    //    1st octet 128 has the binary representation: 10000000
    //    2nd octet 32 has the binary representation: 00100000
    //    3rd octet 10 has the binary representation: 00001010
    //    4th octet 1 has the binary representation: 00000001
    //
    //So 128.32.10.1 == 10000000.00100000.00001010.00000001
    //
    //Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361
    //
    //Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.


    public static String convert(long ip) {


        StringBuilder ipAdress = new StringBuilder();
        StringBuilder sb = new StringBuilder(Long.toBinaryString(ip));
        int delimiter = 8;

        if (ip == 0) {
            return "0.0.0.0";
        } else {

            for (int i = 0; i < 3; i++) {

                sb.insert(delimiter, ".");
                delimiter += 8 + 1;
            }

            String[] split = sb.toString().split("\\.");

            for (int i = 0; i < split.length; i++) {
                ipAdress.append(Integer.parseInt(split[i], 2));

                if (i < split.length - 1) {
                    ipAdress.append(".");
                }

            }

            return ipAdress.toString();
        }


    }
}
