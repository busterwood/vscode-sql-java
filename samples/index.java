class Fred {
    public static void main(String[] args) {
        final String sql = /*sql*/"select * from t where a = 1 and b = 2";

        final String bigsql = /* sql */"""
          select * 
          from t 
          where a = 1 and b = 2
          """;
        
    }
}