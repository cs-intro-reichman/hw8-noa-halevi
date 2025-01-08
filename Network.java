String ans = "Network:";
    for (int i = 0; i < users.length; i++) {
        if (users[i] != null) {
            if (i > 0) {
                ans += "\n"; // הוספת קו רווח רק לפני משתמשים נוספים
            }
            String userName = users[i].getName();
            ans += userName + " -> ";
            if (users[i].getfCount() > 0) {
                for (int j = 0; j < users[i].getfCount(); j++) {
                    ans += users[i].getfFollows()[j];
                    if (j < users[i].getfCount() - 1) {
                        ans += " "; // הוספת רווח רק אם יש עוד עוקבים
                    }
                }
            }
        }
    }
    return ans;
}
