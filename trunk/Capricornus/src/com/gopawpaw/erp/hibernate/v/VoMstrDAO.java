package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VoMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VoMstr
 * @author MyEclipse Persistence Tools
 */

public class VoMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VoMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VoMstr transientInstance) {
		log.debug("saving VoMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VoMstr persistentInstance) {
		log.debug("deleting VoMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VoMstr findById(com.gopawpaw.erp.hibernate.v.VoMstrId id) {
		log.debug("getting VoMstr instance with id: " + id);
		try {
			VoMstr instance = (VoMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VoMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VoMstr instance) {
		log.debug("finding VoMstr instance by example");
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
		log.debug("finding VoMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VoMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VoMstr instances");
		try {
			String queryString = "from VoMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VoMstr merge(VoMstr detachedInstance) {
		log.debug("merging VoMstr instance");
		try {
			VoMstr result = (VoMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VoMstr instance) {
		log.debug("attaching dirty VoMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VoMstr instance) {
		log.debug("attaching clean VoMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VoMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VoMstrDAO) ctx.getBean("VoMstrDAO");
	}
}