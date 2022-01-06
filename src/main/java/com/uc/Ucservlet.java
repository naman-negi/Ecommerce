package com.uc;
import com.u.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class Ucservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Ucservlet() {
        super();
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Configuration configuration=new Configuration().configure("aibernate.cfg.xml");
			configuration.addAnnotatedClass(com.u.User.class);
			StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			SessionFactory factory=configuration.buildSessionFactory(builder.build());
			Session session =factory.openSession();
			Transaction transaction = session.beginTransaction();
			User s=(User)request.getAttribute("user");
		    session.save(s);
			transaction.commit();
		    session.close();
		    response.sendRedirect(request.getContextPath() + "/FirstPage.html");
		}catch(Exception e) {
			System.out.println(e.getMessage());}}}
