package com.company.puodeliai;

public class LatteKava extends KavosPuodelis {

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("");
        builder.append("\n");
        builder.append("         {\n");
        builder.append("      {   }\n");
        builder.append("       }_{ __{\n");
        builder.append("    .-{   }   }-.\n");
        builder.append("   (   }     {   )\n");
        builder.append("   |`-.._____..-'|\n");
        builder.append("   |             ;--.\n");
        builder.append("   |            (__  \\\n");
        builder.append("   |             | )  )\n");
        builder.append("   |             |/  /\n");
        builder.append("   |             /  / \n");
        builder.append("   |            (  /\n");
        builder.append("   \\             y'\n");
        builder.append("    `-.._____..-'");
        return builder.toString();
    }

    public LatteKava(){
        super(new com.company.puodeliai.Produktai(0.33f,20,40),"Latte",0.35f);
    }
}
