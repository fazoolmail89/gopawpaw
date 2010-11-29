package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PjshHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PjshHist
 * @author MyEclipse Persistence Tools
 */

public class PjshHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PjshHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PjshHist transientInstance) {
		log.debug("saving PjshHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PjshHist persistentInstance) {
		log.debug("deleting PjshHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PjshHist findById(com.gopawpaw.erp.hibernate.p.PjshHistId id) {
		log.debug("getting PjshHist instance with id: " + id);
		try {
			PjshHist instance = (PjshHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PjshHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PjshHist instance) {
		log.debug("finding PjshHist instance by example");
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
		log.debug("finding PjshHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PjshHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PjshHist instances");
		try {
			String queryString = "from PjshHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PjshHist merge(PjshHist detachedInstance) {
		log.debug("merging PjshHist instance");
		try {
			PjshHist result = (PjshHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PjshHist instance) {
		log.debug("attaching dirty PjshHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PjshHist instance) {
		log.debug("attaching clean PjshHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PjshHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PjshHistDAO) ctx.getBean("PjshHistDAO");
	}
}