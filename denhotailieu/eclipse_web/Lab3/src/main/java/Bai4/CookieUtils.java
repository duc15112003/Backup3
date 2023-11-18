package Bai4;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieUtils {

	public static jakarta.servlet.http.Cookie add(String name, String value, int hours, HttpServletResponse resp) {
		jakarta.servlet.http.Cookie cookie = new jakarta.servlet.http.Cookie(name, value);
		cookie.setMaxAge(hours * 60 * 60);
		cookie.setPath("/");
		resp.addCookie(cookie);
		return cookie;

	}

	public static String get(String name, HttpServletRequest req) {
		jakarta.servlet.http.Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (jakarta.servlet.http.Cookie cookie : cookies) {
				if (cookie.getName().equalsIgnoreCase(name)) {
					return cookie.getValue();
				}
			}
		}
		return "";
	}
}
