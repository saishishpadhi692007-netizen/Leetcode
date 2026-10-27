class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; // Sabse ameer customer ki wealth store karne ke liye
        
        // Har customer (row) ke liye loop chalayenge
        for (int i = 0; i < accounts.length; i++) {
            int currentCustomerWealth = 0; // Har ek customer ke accounts ka sum
            
            // Us customer ke saare bank accounts (columns) ko jodenge
            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }
            
            // Agar current customer ki wealth pichle max se zyada hai, toh update kar do
            if (currentCustomerWealth > maxWealth) {
                maxWealth = currentCustomerWealth;
            }
        }
        
        return maxWealth; // Final sabse zyada wealth return kar denge
    }
}
