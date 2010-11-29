package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CodeMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CodeMstr
 * @author MyEclipse Persistence Tools
 */

public class CodeMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CodeMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CodeMstr transientInstance) {
		log.debug("saving CodeMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CodeMstr persistentInstance) {
		log.debug("deleting CodeMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CodeMstr findById(com.gopawpaw.erp.hibernate.c.CodeMstrId id) {
		log.debug("getting CodeMstr instance with id: " + id);
		try {
			CodeMstr instance = (CodeMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CodeMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CodeMstr instance) {
		log.debug("finding CodeMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CodeMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CodeMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CodeMstr instances");
		try {
			String queryString = "from CodeMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CodeMstr merge(CodeMstr detachedInstance) {
		log.debug("merging CodeMstr instance");
		try {
			CodeMstr result = (CodeMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CodeMstr instance) {
		log.debug("attaching dirty CodeMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CodeMstr instance) {
		log.debug("attaching clean CodeMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CodeMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CodeMstrDAO) ctx.getBean("CodeMstrDAO");
	}
}