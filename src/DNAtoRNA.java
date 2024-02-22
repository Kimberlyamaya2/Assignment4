public class DNAtoRNA {
    public static void main(String[] args) {
        String dna1 = "AGCTGGGAAACGTAGGCCTA";
        String dna2 = "TTTTTTTTTTGGCGCG";
        String dna3 = "CTTTGGGACTAGTAACCCATTTCGGCT";

        String rna1 = DNAtoRNA(dna1);
        String rna2 = DNAtoRNA(dna2);
        String rna3 = DNAtoRNA(dna3);

        System.out.println("Input DNA1: " + dna1 + "\n" + "Output RNA1: " + rna1);
        System.out.print("\n");
        System.out.println("Input DNA2: " + dna2 + "\n" + "Output RNA2: " + rna2);
        System.out.print("\n");
        System.out.println("Input DNA3: " + dna3 + "\n" + "Output RNA3: " + rna3);
}
    public static String DNAtoRNA (String dna) {
         StringBuilder rna = new StringBuilder();
        for (char nucleotide : dna.toCharArray()) {
            switch (nucleotide) {
                case 'A':
                    rna.append('A');
                    break;
                case 'C':
                    rna.append('C');
                    break;
                case 'G':
                    rna.append('G');
                    break;
                case 'T':
                    rna.append('U');
                    break;
                default:
                    System.out.println("Invalid character in DNA sequence: " + nucleotide);
            }
        }

        return rna.toString();
    }
}
