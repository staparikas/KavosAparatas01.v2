package com.company.puodeliai;

public class EspressoKava extends com.company.puodeliai.KavosPuodelis {
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("");
        builder.append("  .-=-.\n");
        builder.append(" ,|`~'|\n");
        builder.append(" `|   | \n");
        builder.append("   `~'");
        return builder.toString();
    }

    public EspressoKava(){
        super(new com.company.puodeliai.Produktai(0.1f,10,40),"Espresso",0.15f);
    }
}
