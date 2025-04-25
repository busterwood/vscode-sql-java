class Fred {
    public static void main(String[] args) {
        final String sql = /*sql*/"select * from t where a = 1 and b = 2";

        final String bigsql = /* sql */"""
          select * 
          from t 
          where a = 1 and b = 2
          """;

        final String html1 = /*html*/"<div><p>hello</p></div>";

        final String html2 = /* html */"""
          <a href="https://example.com">
            <img src="https://example.com/image.png" alt="Image">
          </a>
          """;
        
    }
}