package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Fsp1Pln entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.Fsp1Pln
 * @author MyEclipse Persistence Tools
 */

public class Fsp1PlnDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Fsp1PlnDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Fsp1Pln transientInstance) {
		log.debug("saving Fsp1Pln instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Fsp1Pln persistentInstance) {
		log.debug("deleting Fsp1Pln instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fsp1Pln findById(com.gopawpaw.erp.hibernate.f.Fsp1PlnId id) {
		log.debug("getting Fsp1Pln instance with id: " + id);
		try {
			Fsp1Pln instance = (Fsp1Pln) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.Fsp1Pln", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Fsp1Pln instance) {
		log.debug("finding Fsp1Pln instance by example");
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
		log.debug("finding Fsp1Pln instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Fsp1Pln as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Fsp1Pln instances");
		try {
			String queryString = "from Fsp1Pln";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Fsp1Pln merge(Fsp1Pln detachedInstance) {
		log.debug("merging Fsp1Pln instance");
		try {
			Fsp1Pln result = (Fsp1Pln) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Fsp1Pln instance) {
		log.debug("attaching dirty Fsp1Pln instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fsp1Pln instance) {
		log.debug("attaching clean Fsp1Pln instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Fsp1PlnDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Fsp1PlnDAO) ctx.getBean("Fsp1PlnDAO");
	}
}