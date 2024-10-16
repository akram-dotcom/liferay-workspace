@ProcessAction(name = "calculateAmount")
public void calculateAmount(ActionRequest request, ActionResponse response) {
    String options = ParamUtil.getString(request, "options");
    String dob = ParamUtil.getString(request, "dob");
    // Logique de calcul ici
    double amount = 200.00; // Exemple de montant calculé
    request.setAttribute("amount", amount);
}
public class CalculMontant {
    public static void main(String[] args) {
        int ndv = 2; // nombre de véhicules
        int duree = 2; // durée en années
        double map = calculerMontant(ndv, duree);
        System.out.println("Le montant à payer est : " + map);
    }

    public static double calculerMontant(int ndv, int duree) {
        double map = 200;

        if (duree == 0.5 && (ndv == 0 || ndv == 1)) {
            map = 200;
        } else {
            map = 200 + (ndv - 1) * 100;
        }

        if (duree == 1) {
            map *= 1.8;
        } else if (duree > 1) {
            map *= Math.pow(1.8, duree);
        }

        return map;
    }
}
