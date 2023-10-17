package com.example.Http_Server.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setStatus(HttpServletResponse.SC_OK);

        // Get the current real-time date and time
        Date currentDate = new Date();
        // Format the date to the desired format
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        String formattedDate = dateFormat.format(currentDate);
        resp.setHeader("Date", formattedDate);
        resp.setHeader("Server", "Ali_Hassan_Test_Server/2.1");
        resp.setHeader("Content-Type", "text/html");
        resp.setHeader("Content-Length", "1082");

        resp.setContentType("text/html");
        req.getRequestDispatcher("/index.html").forward(req, resp);

        resp.getWriter().close();

    }
}
