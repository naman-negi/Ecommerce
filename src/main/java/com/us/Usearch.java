package com.us;
import com.u.User;
import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;


public class Usearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Usearch() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration configuration=new Configuration().configure();
		configuration.addAnnotatedClass(com.u.User.class);
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session =factory.openSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		session.beginTransaction();
		CriteriaQuery<Object> crt = cb.createQuery(Object.class);
		Root<User> root = crt.from(User.class);
		crt.select(root.get("username"));
		Query query = session.createQuery(crt);
		List<User> collection = query.getResultList();
		for(User object : collection)
		{
			System.out.println("Id : " + object);
			System.out.println();
		}
			session.getTransaction().commit();
		session.close();
	/*	if (str1.equalsIgnoreCase("admin")&&str2.equals("12345")) {
			response.sendRedirect(request.getContextPath() + "/homepage3.jsp");
		}else {
			RequestDispatcher rd=null;
			rd=request.getRequestDispatcher("homepage2.html");
			out=response.getWriter();
			rd.include(request, response);
			out.println("<center><span style='color:red'>Invalid Credentials</span></center>");
		}*/
		}}
