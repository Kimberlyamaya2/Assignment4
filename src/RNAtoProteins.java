import java.util.HashMap;

public class RNAtoProteins {
    public static void main(String[] args) {
        String rna1 = "AGCUGGGAAACGUAGGCCUA";
       // String rna2 = "UAAAGAGAAGCCAGC"; output = .REAS
        //updated input; output = .GREAT
        String rna2 = "UAAGGAAGAGAAGCCACG";

        String protein1 = RNAtoProteins(rna1);
        String protein2 = RNAtoProteins(rna2);


        System.out.println("Input: " + rna1 + "\n" + "Output: " + protein1);
        System.out.print("\n");
        System.out.println("Input: " + rna2 + "\n" + "Output: " + protein2);

    }
    public static String RNAtoProteins (String rna) {
        StringBuilder aminoAcidSeq = new StringBuilder();
        HashMap<String, Character> codon = new HashMap<>();
        codon.put("UUU", 'F');     codon.put("CUU", 'L');   codon.put("CGC", 'R');  codon.put("AAG", 'K');  codon.put("GAU", 'D');
        codon.put("UUC", 'F');     codon.put("CUC", 'L');   codon.put("CGA", 'R');  codon.put("AGU", 'S');  codon.put("GAC", 'D');
        codon.put("UUA", 'L');     codon.put("CUA", 'L');   codon.put("CGG", 'R');  codon.put("AGC", 'S');  codon.put("GAA", 'E');
        codon.put("UUG", 'L');     codon.put("CUG", 'L');   codon.put("AUU", 'I');  codon.put("AGA", 'R');  codon.put("GAG", 'E');
        codon.put("UCU", 'S');     codon.put("CCC", 'P');   codon.put("AUC", 'I');  codon.put("AGG", 'R');  codon.put("GGU", 'G');
        codon.put("UCC", 'S');     codon.put("CCU", 'P');   codon.put("AUA", 'I');  codon.put("GUU", 'V');  codon.put("GGC", 'G');
        codon.put("UCA", 'S');     codon.put("CCA", 'P');   codon.put("ACU", 'T');  codon.put("GUC", 'V');  codon.put("GGA", 'G');
        codon.put("UCG", 'S');     codon.put("CCG", 'P');   codon.put("ACC", 'T');  codon.put("GUA", 'V');  codon.put("GGG", 'G');
        codon.put("UAU", 'Y');     codon.put("CAU", 'H');   codon.put("ACA", 'T');  codon.put("GUG", 'V');  codon.put("UAA", '.');
        codon.put("UAC", 'Y');     codon.put("CAC", 'H');   codon.put("ACG", 'T');  codon.put("GCU", 'A');  codon.put("UAG", '.');
        codon.put("UGU", 'C');     codon.put("CAA", 'Q');   codon.put("AAU", 'N');  codon.put("GCC", 'A');  codon.put("UGA", '.');
        codon.put("UGC", 'C');     codon.put("CAG", 'Q');   codon.put("AAC", 'N');  codon.put("GCA", 'A');  codon.put("AUG", 'M');
        codon.put("UGG", 'W');     codon.put("CGU", 'R');   codon.put("AAA", 'K');  codon.put("GCG", 'A');

        for(int i = 0; i < rna.length(); i+=3){
            if(i + 3 <= rna.length()){
                String s = rna.substring(i, i + 3);
                char aminoAcid = codon.getOrDefault(s, '?');
                aminoAcidSeq.append(aminoAcid);
            }
            else{
                aminoAcidSeq.append(".");
            }
        }
        return aminoAcidSeq.toString();
    }
}
