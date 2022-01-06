package com.to;
import com.controller.Shoe;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.exception.SQLGrammarException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class Viewinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Viewinfo() {super(); }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLGrammarException {
		try {
			Configuration configuration=new Configuration().configure("cfg.xml");
			configuration.addAnnotatedClass(com.controller.Shoe.class);
			StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			SessionFactory factory=configuration.buildSessionFactory(builder.build());
			Session session =factory.openSession();
			Transaction transaction = session.beginTransaction();
			Shoe s=(Shoe)request.getAttribute("user");
			session.save(s);
			transaction.commit();
		//	session.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());}
}
}