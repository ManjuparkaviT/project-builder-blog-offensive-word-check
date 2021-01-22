package utility;
import model.Blog;
public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String[] offensiveWords={"acrotomophilia","aeolus","ahole","alabama hot pocket","alaskan pipeline","anal",
	                           "anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","ar5e","areola",
	                           "areole","arian","arrse","arse","arsehole","aryan","ass","ass fuck","ass fuck","ass hole","assbag"};
	public boolean checkBlog(Blog blog) {
		 if(checkBlogTitle(blog) && checkBlogDescription(blog)) {
			 return true;
		 }
		 return false;
	}
	public boolean checkBlogTitle(Blog blog) {
		for(String item:offensiveWords) {
			if(blog.getBlogTitle().contains(item)){
				return false;
			}
		}
		return false;
	}
	public boolean checkBlogDescription(Blog blog) {
		for(String item:offensiveWords) {
			if(blog.getBlogDescription().contains(item)) {
				return false;
			}
	    }
		return true;
	}
}